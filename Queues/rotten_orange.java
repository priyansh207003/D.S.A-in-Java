import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Step 1: Count fresh oranges and add all rotten oranges to queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c}); // rotten orange
                }

                if (grid[r][c] == 1) {
                    fresh++; // fresh orange count
                }
            }
        }

        // If no fresh oranges exist
        if (fresh == 0) return 0;

        int minutes = 0;

        // Directions: up, down, left, right
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        // Step 2: BFS Traversal
        while (!queue.isEmpty()) {

            int size = queue.size();
            boolean rottedThisMinute = false;

            // Process all oranges in current BFS level
            for (int i = 0; i < size; i++) {

                int[] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];

                // Check 4 neighbors
                for (int[] dir : directions) {

                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    // If neighbor is inside grid and fresh
                    if (newX >= 0 && newX < rows &&
                        newY >= 0 && newY < cols &&
                        grid[newX][newY] == 1) {

                        // Rot the fresh orange
                        grid[newX][newY] = 2;
                        fresh--;

                        // Add newly rotten orange to queue
                        queue.offer(new int[]{newX, newY});

                        rottedThisMinute = true;
                    }
                }
            }

            // Increase time only if rotting happened
            if (rottedThisMinute) {
                minutes++;
            }
        }

        // Step 3: If fresh oranges remain, return -1
        return (fresh == 0) ? minutes : -1;
    }
}
