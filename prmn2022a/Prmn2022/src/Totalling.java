class Totalling {
    int min(int score[]) {
        int lowest = 100;
        for (int i : score) {
            if (lowest >= i) {
                lowest = i;
            }
        }
        return lowest;
    }

    int max(int score[]) {
        int highest = 0;
        for (int i : score) {
            if (highest <= i) {
                highest = i;
            }
        }
        return highest;
    }

    double average(int score[]) {
        int sum = 0;
        for (int i : score) {
            sum = sum + i;
        }
        return (double) sum / (double) score.length;
    }

    void judge(int score[]) {
        String grade;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                grade = "不可";
            } else if (60 <= score[i] && score[i] < 70) {
                grade = "可";
            } else if (70 <= score[i] && score[i] < 80) {
                grade = "良";
            } else if (80 <= score[i] && score[i] < 90) {
                grade = "優";
            } else {
                grade = "秀";
            }
            System.out.println(i + "番　" + score[i] + "点　" + grade);
        }
    }
}
