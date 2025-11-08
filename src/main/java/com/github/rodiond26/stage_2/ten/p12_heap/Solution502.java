package com.github.rodiond26.stage_2.ten.p12_heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solution502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // проекты, отсортированные по минимальному капиталу для того, чтобы взять проект
        List<Project> projects = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            Project project = new Project(profits[i], capital[i]);
            projects.add(project);
        }
        projects.sort(Comparator.comparingInt(project -> project.capital));

        // количество проектов, которые уже посмотрели
        int checked = 0;

        // куча проектов, на которые хватит денег, отсортированы по максимальному профиту
        PriorityQueue<Project> canAffordProjects = new PriorityQueue<>((a, b) -> Integer.compare(b.profit, a.profit));

        for (int i = 0; i < k; i++) {
            while (checked < projects.size() && projects.get(checked).capital <= w) {
                canAffordProjects.add(projects.get(checked));
                checked++;
            }

            if (canAffordProjects.isEmpty()) {
                break;
            }

            Project currentMaxProfitProject = canAffordProjects.poll();
            w += currentMaxProfitProject.profit;
        }
        return w;
    }
}

class Project {
    final int profit;
    final int capital;

    public Project(int profit, int capital) {
        this.profit = profit;
        this.capital = capital;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Project project = (Project) other;
        return profit == project.profit && capital == project.capital;
    }

    @Override
    public int hashCode() {
        int result = profit;
        result = 31 * result + capital;
        return result;
    }
}
