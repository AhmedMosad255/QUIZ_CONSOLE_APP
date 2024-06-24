
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    int[] selection = new int[5];

    public QuestionService() {
        questions[0] = new Question("String", 3, 1, "int", "boolean", "String", "char",
                "Which of the following is not a primitive data type in Java?");
        questions[1] = new Question("tuple", 2, 2, "list", "tuple", "dict", "set",
                "Which of the following is an immutable type in Python?");
        questions[2] = new Question("new", 3, 3, "malloc", "calloc", "new", "alloc",
                "Which of the following is used to dynamically allocate memory in C++?");
        questions[3] = new Question("Module scope", 4, 4, "Block Scope", "Function Scope", "Global Scope",
                "Module scope",
                "Which type of variable scope is not supported in JavaScript?");
        questions[4] = new Question("<ul>", 1, 5, "<ul>", "<ol>", "<li>", "<dl>",
                "Which HTML tag is used to define an unordered list?");
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question Number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());

            System.out.print("Your answer (enter the option number): ");
            selection[i] = sc.nextInt();

            if (selection[i] == q.getCorrectOption()) {
                score++;
            }
        }

        System.out.println("\nQuiz Results:");
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question " + q.getId() + ": " + q.getQuestion());
            System.out.println("Your answer: " + selection[i]);
            System.out.println("Correct answer: " + q.getCorrectAnswer() + " (Option " + q.getCorrectOption() + ")");
            if (selection[i] == q.getCorrectOption()) {
                System.out.println("Result: Correct");
            } else {
                System.out.println("Result: Incorrect");
            }
            System.out.println();
        }

        System.out.println("Your total score is: " + score + " out of " + questions.length);
    }
}