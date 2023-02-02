class menudriven{

    public static void linear()
    {
        SYstem.out.println("Linear");
    }

    public static void binary()
    {
        System.out.println("binary")
    }
    public static void main(String args[])
    {
        System.out.println("Enter number 1. linear 2.binary");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

       Switch n
        {
            case 1:
                System.out.println("Linear code here");
                break;
            case 2:
                System.out.println("Binary code here");
                break;
            default:
                System.out.println("Enter valid number");

        }
    }
}