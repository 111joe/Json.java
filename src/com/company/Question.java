package com.company;

public class Question {
    String question;
    String answerСhoices;
    String trueAnswer;
    int tegs;

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answerСhoices='" + answerСhoices + '\'' +
                ", trueAnswer='" + trueAnswer + '\'' +
                ", tegs=" + tegs +
                '}';
    }

    public Question(String question, String answerСhoices, String trueAnswer, int tegs) {
        this.question = question;
        this.answerСhoices = answerСhoices;
        this.trueAnswer = trueAnswer;
        this.tegs = tegs;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerСhoices() {
        return answerСhoices;
    }

    public void setAnswerСhoices(String answerСhoices) {
        this.answerСhoices = answerСhoices;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public int getTegs() {
        return tegs;
    }

    public void setTegs(int tegs) {
        this.tegs = tegs;
    }
}
