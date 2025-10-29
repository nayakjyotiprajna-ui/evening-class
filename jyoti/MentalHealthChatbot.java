import java.util.Scanner;
import java.util.Random;

public class MentalHealthChatbot {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to MindMate: Your AI Mental Health Companion!");
        System.out.println("I'm here to listen and support you. Remember, I'm not a substitute for professional help.");
        System.out.println("Type 'exit' to end the conversation.\n");

        String userInput;
        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("MindMate: Take care of yourself. If you need help, reach out to a professional or hotline.");
                break;
            }

            // Simulate "thinking" with a short delay
            try {
                Thread.sleep(1000 + random.nextInt(2000)); // 1-3 seconds delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            String response = generateResponse(userInput);
            System.out.println("MindMate: " + response);
        }
    }

    private static String generateResponse(String input) {
        // Simple keyword-based responses (expandable with NLP in a real hackathon)
        if (input.contains("sad") || input.contains("depressed")) {
            return "I'm sorry you're feeling this way. It's okay to feel sad sometimes. Try a deep breathing exercise: Inhale for 4 seconds, hold for 4, exhale for 4. What's been on your mind?";
        } else if (input.contains("anxious") || input.contains("worried")) {
            return "Anxiety can be tough. Ground yourself by naming 5 things you can see around you. Would you like to journal about what's causing this?";
        } else if (input.contains("happy") || input.contains("good")) {
            return "That's great to hear! Celebrating small wins is important. What made you feel this way today?";
        } else if (input.contains("stress") || input.contains("overwhelmed")) {
            return "Stress is common. Break it down: What's one small step you can take right now? I'm here to help you think through it.";
        } else if (input.contains("mood")) {
            return "On a scale of 1-10, how would you rate your mood today? Tracking it can help spot patterns.";
        } else if (input.contains("help") || input.contains("crisis")) {
            return "If you're in crisis, please contact a professional or hotline like 988 (US) or your local equivalent. I'm here for support, but they can provide immediate help.";
        } else {
            // Default empathetic response
            String[] defaults = {
                "That sounds important. Can you tell me more?",
                "I'm listening. How does that make you feel?",
                "Thanks for sharing. What's one thing that could help right now?",
                "It's brave to open up. Let's explore this together."
            };
            return defaults[random.nextInt(defaults.length)];
        }
    }
}
