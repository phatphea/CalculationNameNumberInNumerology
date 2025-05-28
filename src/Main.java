import java.text.DecimalFormat;
import java.text.Format;
import java.util.Arrays;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         *
         | A, J, S → 1 | B, K, T → 2 | C, L, U → 3 |

         | D, M, V → 4 | E, N, W → 5 | F, O, X → 6 |

         | G, P, Y → 7 | H, Q, Z → 8 | I, R → 9 |
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        name = name.trim();
        name = name.replace(" ", "");
        name = name.toUpperCase();

        char[] letter = name.toCharArray();
        System.out.println("Break all letter to number:");
        int sum=0;
        int num = 0;
        for (char c : letter) {
            switch (c) {
                case 'A', 'J', 'S':
                    num = 1;
                    break;
                case 'B', 'K', 'T':
                    num = 2;
                    break;
                case 'C', 'L', 'U':
                    num = 3;
                    break;
                case 'D', 'M', 'V':
                    num = 4;
                    break;
                case 'E', 'N', 'W':
                    num = 5;
                    break;
                case 'F', 'O', 'X':
                    num = 6;
                    break;
                case 'G', 'P', 'Y':
                    num = 7;
                    break;
                case 'H', 'Q', 'Z':
                    num = 8;
                    break;
                case 'I', 'R':
                    num = 9;
                    break;
                default:
            }
            System.out.print(num + ",");
            sum += num;
        }
        System.out.println("\b");
        System.out.println("Sum is : " + sum);

        // Reduce sum if necessary (except for Master Numbers 11, 22, 33)
        while (!(sum == 11 || sum == 22 || sum == 33) && sum > 9) {
            sum = reduceNumber(sum);
        }

        System.out.println("Final Numerology Number: " + sum);

        switch (sum){
            case 1:
                System.out.println("Your type: Initiator of action, pioneering, leading, independent, attaining, individualistic");
                break;
            case 2:
                System.out.println("Your type: Cooperation, adaptability, consideration of others, partnering, mediating");
                break;
            case 3:
                System.out.println("Your type: Expression, verbalization, socialization, the arts, the joy of living");
                break;
            case 4:
                System.out.println("Your type: Values foundation, order, service, struggle against limits, steady growth");
                break;
            case 5:
                System.out.println("Your type: Expansiveness, visionary, adventure, the constructive use of freedom");
                break;
            case 6:
                System.out.println("Your type: Responsibility, protection, nurturing, community, balance, sympathy");
                break;
            case 7:
                System.out.println("Your type: Analysis, understanding, knowledge, awareness, studious, meditating");
                break;
            case 8:
                System.out.println("Your type: Practical endeavors, status-oriented, power-seeking, high-material goals");
                break;
            case 9:
                System.out.println("Your type: Humanitarian, giving nature, selflessness, obligations, creative");
                break;
            case 11:
                System.out.println("Your type: Higher spiritual plane, intuitive, illumination, idealist, a dreamer");
                break;
            case 22:
                System.out.println("Your type: The Master Builder, large endeavors, powerful force, leadership");
                break;
            default:
        }

    }
    // method reduce number
    private static int reduceNumber(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}