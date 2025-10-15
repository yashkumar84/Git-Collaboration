import java.util.HashMap;
import java.util.Scanner;

public class NumeroDigits {

    static HashMap<Integer, String[]> numberSaying = new HashMap();

    public static void main(String args[]) {
        numberSaying();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your DOB: ");

        int num = scanner.nextInt();

        while (num > 10) {
            int sum = 0;

            while (num != 0) {
                int lastDigit = num % 10;
                num = num / 10;
                sum = sum + lastDigit;
            }
            num = sum;
        }

        String[] sayings = numberSaying.get(num);
        System.out.println(" ");
        System.out.println("Your number is: " + num);
        System.out.println(" ");
        System.out.println(String.join(", ", sayings));

        scanner.close();
    }

    static void numberSaying() {
        numberSaying.put(1, new String[] {
                """
                        ===> The Leader
                                    -> Keywords: Independent, ambitious, assertive, confident.
                                    -> Personality Traits:

                                    -> Born to lead, not follow.

                                    -> Highly self-motivated, original thinker.

                                    -> Prefers autonomy — dislikes being controlled.

                                    -> Sometimes seen as stubborn or ego-driven.

                                    ->  Strength lies in initiative and self-reliance.
                                    ->  Career Fit: Entrepreneurship, management, politics, innovation.
                                                    """
        });
        numberSaying.put(2, new String[] {
                """
                        ===> The Diplomat

                        -> Keywords: Cooperative, sensitive, empathetic, balanced.
                        -> Personality Traits:

                        -> Peace-maker; values harmony in relationships.

                        -> Intuitive and emotionally intelligent.

                        -> Often avoids conflict, preferring diplomacy.

                        -> Can be indecisive or overly accommodating.
                        -> Career Fit: Counseling, teaching, HR, design, diplomacy.
                                                """
        });
        numberSaying.put(3, new String[] {
                """
                        ===> The Communicator

                        -> Keywords: Creative, expressive, sociable, joyful.
                        -> Personality Traits:

                        -> Natural storyteller and entertainer.

                        -> Radiates optimism and artistic flair.

                        -> Thrives in social settings.

                        -> May struggle with focus or discipline.
                        -> Career Fit: Media, writing, art, marketing, public speaking.
                                               """
        });
        numberSaying.put(4, new String[] {
                """
                        ===> The Builder

                        -> Keywords: Practical, disciplined, methodical, loyal.
                        -> Personality Traits:

                        -> Hardworking and detail-oriented.

                        -> Values structure, stability, and consistency.

                        -> Often the “backbone” of any team.

                        -> Can be rigid or resistant to change.
                        -> Career Fit: Engineering, architecture, accounting, project management.
                                               """
        });
        numberSaying.put(5, new String[] {
                """
                        ===> The Explorer

                        -> Keywords: Adventurous, freedom-loving, adaptable, curious.
                        -> Personality Traits:

                        -> Thrives on change, travel, and new experiences.

                        -> Highly versatile and quick to adapt.

                        -> Avoids monotony; craves excitement.

                        -> Can appear restless or inconsistent.
                        -> Career Fit: Sales, travel, media, technology, performance arts.
                                                                        """
        });
        numberSaying.put(6, new String[] {
                """
                        ===> The Nurturer

                        -> Keywords: Caring, responsible, family-oriented, loyal.
                        -> Personality Traits:

                        -> Protective and deeply compassionate.

                        -> Feels responsible for others’ well-being.

                        -> Natural teacher, parent, and supporter.

                        -> Can become controlling or overprotective.
                        -> Career Fit: Healthcare, education, community work, hospitality.
                                               """
        });
        numberSaying.put(7, new String[] {
                """
                        ===> The Thinker

                        -> Keywords: Analytical, introspective, spiritual, private.
                        -> Personality Traits:

                        -> Deep thinker; seeks truth and wisdom.

                        -> Often drawn to spirituality or philosophy.

                        -> Values solitude and intellectual pursuits.

                        -> Can seem distant or skeptical.
                        -> Career Fit: Research, academia, IT, philosophy, psychology.
                                                """
        });
        numberSaying.put(8, new String[] {
                """
                        ===> The Achiever

                        -> Keywords: Ambitious, authoritative, material-driven, efficient.
                        -> Personality Traits:

                        -> Goal-oriented and business-minded.

                        -> Strong leadership and organizational skills.

                        -> Attracted to wealth, success, and recognition.

                        -> Can appear domineering or work-obsessed.
                        -> Career Fit: Business, finance, real estate, executive roles.
                                                """
        });
        numberSaying.put(9, new String[] {
                """
                        ===> The Humanitarian

                        -> Keywords: Compassionate, generous, idealistic, visionary.
                        -> Personality Traits:

                        -> Emotionally mature and spiritually evolved.

                        -> Cares deeply about global and social issues.

                        -> Often artistic and philosophical.

                        -> Can be overly self-sacrificing or sentimental.
                        -> Career Fit: Social work, arts, charity, healing, diplomacy.
                                               """
        });
    }

}
