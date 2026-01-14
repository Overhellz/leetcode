package com.github.rodiond26.stage_2.ten.p21_backtracking;

import java.util.HashSet;
import java.util.Set;

class Solution489 {

    private int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; // вверх, право, низ, лево
    private Set<String> visited = new HashSet<>();
    private Robot robot;

    public void cleanRoom(Robot robot) {
        this.robot = robot;
        backtrack(0, 0, 0);
    }

    private void backtrack(int row, int col, int direction) {
        // Помечаем текущую позицию как посещенную и очищаем
        visited.add(row + "," + col);
        robot.clean();

        // Пробуем двигаться во всех 4 направлениях
        for (int i = 0; i < 4; i++) {
            int newDirection = (direction + i) % 4;
            int newRow = row + directions[newDirection][0];
            int newCol = col + directions[newDirection][1];

            // Если новая позиция не посещена и робот может туда двигаться
            if (!visited.contains(newRow + "," + newCol) && robot.move()) {
                backtrack(newRow, newCol, newDirection);
                // Возвращаемся назад (backtracking)
                goBack();
            }
            // Поворачиваем направо (следующее направление)
            robot.turnRight();
        }
    }

    private void goBack() {
        robot.turnRight();
        robot.turnRight(); // Поворачиваем на 180 градусов
        robot.move();      // Возвращаемся в предыдущую позицию
        robot.turnRight();
        robot.turnRight(); // Возвращаем исходную ориентацию
    }
}
