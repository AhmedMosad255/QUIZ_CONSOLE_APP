class Question {
    private String correctAnswer;
    private int correctOption;
    private int id;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String question;

    public Question(String correctAnswer, int correctOption, int id, String opt1, String opt2, String opt3, String opt4,
            String question) {
        this.correctAnswer = correctAnswer;
        this.correctOption = correctOption;
        this.id = id;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("correctAnswer=").append(correctAnswer);
        sb.append(", correctOption=").append(correctOption);
        sb.append(", id=").append(id);
        sb.append(", opt1=").append(opt1);
        sb.append(", opt2=").append(opt2);
        sb.append(", opt3=").append(opt3);
        sb.append(", opt4=").append(opt4);
        sb.append(", question=").append(question);
        sb.append('}');
        return sb.toString();
    }

}