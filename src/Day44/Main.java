package Day44;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<Question>questions = new ArrayList<>();

    ArrayList<String> options1 = new ArrayList<>(List.of("City1","City2","City3", "Paris"));
    Question question2 = new Question("what is the capital of france?", options2, 2);

    question.add(question1);
    question.add(question2);

    Quiz quiz = new Quiz(questions);
    quiz.start();
}
