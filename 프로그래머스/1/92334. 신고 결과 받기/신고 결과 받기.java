import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        // report 배열에서 HashSet을 이용해 중복 요소 제거
        HashSet<String> uniqueReport = new HashSet<>(Arrays.asList(report));
        String[] report1 = uniqueReport.toArray(new String[0]);

        HashMap<String, Integer> reportedCounts = new HashMap<>(); // 각 사용자별 누적된 신고 횟수 저장

        // 신고된 횟수를 세고 해시맵에 저장
        for (int i = 0; i < report1.length; i++) {
            String reportedUser = report1[i].substring(report1[i].indexOf(" ") + 1); // 신고된 사람의 이름을 추려내고
            // 누적된 신고 횟수를 갱신하여 reportedCounts에 저장
            reportedCounts.put(reportedUser, reportedCounts.getOrDefault(reportedUser, 0) + 1); 
            // getOrDefault() => 해당하는 키의 값이 존재하면 해당 값을, 그렇지 않다면 기본값을 반환
        }

        // 불량 이용자를 신고한 사용자 목록 저장을 위한 Map 생성
        HashMap<String, HashSet<String>> reporterByUserId = new HashMap<>();

        // 각 id별 신고한 불량 이용자 목록 저장
        for (int i = 0; i < report1.length; i++) {
            String reporter = report1[i].substring(0, report1[i].indexOf(" "));
            String reportedUser = report1[i].substring(report1[i].indexOf(" ") + 1);
            // reporterByUserId 해시맵에 중복없이 신고한 사용자 리스트 추가
            reporterByUserId.putIfAbsent(reporter, new HashSet<>());
            reporterByUserId.get(reporter).add(reportedUser);
        }

        for (int id = 0; id < id_list.length; id++) {
            HashSet<String> reportedUsers = reporterByUserId.getOrDefault(id_list[id], new HashSet<>());
            // 각 사용자에게 신고된 불량 이용자들을 확인하고 k번 이상 신고된 경우
            for (String user : reportedUsers) {
                // 만약 특정 사용자의 신고 횟수가 k 이상이라면 answer[id] 증가
                if (reportedCounts.getOrDefault(user, 0) >= k) {
                    answer[id]++;
                }
            }
        }

        return answer;
    }
}
