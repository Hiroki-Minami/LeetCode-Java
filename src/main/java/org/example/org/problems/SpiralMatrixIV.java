package org.example.org.problems;
import org.example.org.util.ListNode;

public class SpiralMatrixIV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = -1;
            }
        }

        boolean[][] visited = new boolean[m][n];
        ListNode cur = head;

        int y = 0;
        int x = 0;
        int dy = 0;
        int dx = 1;

        while (cur != null) {
            answer[y][x] = cur.val;
            visited[y][x] = true;
            int ny = y + dy;
            int nx = x + dx;
            if (ny < m && ny >= 0 && nx < n && nx >= 0 && !visited[ny][nx]) {
                y = ny;
                x = nx;
            } else {
                // change direction
                if (dy == 0 && dx == 1) {
                    dy = 1;
                    dx = 0;
                } else if (dy == 1 && dx == 0) {
                    dy = 0;
                    dx = -1;
                } else if (dy == 0 && dx == -1) {
                    dy = -1;
                    dx = 0;
                } else if (dy == -1 && dx == 0) {
                    dy = 0;
                    dx = 1;
                }
                y = y + dy;
                x = x + dx;
            }
            cur = cur.next;
        }
        return answer;
    }
}
