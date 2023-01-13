/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitnessapp;

import javax.swing.JOptionPane;

/**
 *
 * @author sofiyald
 */
public class Exercise extends javax.swing.JFrame {

    /**
     * Creates new form Exercise
     */
    public Exercise() {
        initComponents();
        setLocationRelativeTo(null);
        Area();
    }
    private static String day;
    private static String pol;
    private static String cel;

    public static String getDay() 
    {
        return day;
    }
    public static void setDay(String day) 
    {
        Exercise.day = day;
    }
    public static String getPol() 
    {
        return pol;
    }
    public static void setPol(String pol) 
    {
        Exercise.pol = pol;
    }
    public static String getCel() 
    {
        return cel;
    }
    public static void setCel(String cel)
    {
        Exercise.cel = cel;
    }
    
    public Exercise(String day, String pol, String cel)
    {
        this.day = day;
        this.pol = pol;
        this.cel = cel;
    }
    
    public void Area()
    {
        if(getPol().equals("Female"))
        {
            //iveto
            if(getCel().equals("Stay fit"))
            {
                if(getDay().equals("Monday"))
                {
                    jLabel1.setText("1.Jumping jacks x40");
                    jLabel2.setText("2.Push-ups x8");
                    jLabel3.setText("3.Squat x20");
                    jLabel4.setText("4.Split squat x10 each leg");
                    jLabel5.setText("5.Bounce lunge x12 each leg");
                    jLabel6.setText("6.Russian twist x20");
                    jLabel7.setText("7.Plank x45s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Tuesday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Push-ups x8");
                    jLabel3.setText("3.Burpee x12");
                    jLabel4.setText("4.Dumbbell rows  x10 (x2)");
                    jLabel5.setText("5.Lunge x15 each leg");
                    jLabel6.setText("6.Squat – 20");
                    jLabel7.setText("7.Plank x45s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Wednesday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Push-ups x8");
                    jLabel3.setText("3.Squat x20");
                    jLabel4.setText("4.Side plank x15s each side");
                    jLabel5.setText("5.Crunches x20 ");
                    jLabel6.setText("6.Flutter kicks x15s");
                    jLabel7.setText("7.Walking lunges x10 (x2)");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Thursday"))
                {
                    jLabel1.setText("1.Jumping jacks x40");
                    jLabel2.setText("2.Triceps dip x15");
                    jLabel3.setText("3.Shoulder tap x12");
                    jLabel4.setText("4.Cross knee plank x18");
                    jLabel5.setText("5.Crunches x20");
                    jLabel6.setText("6.One leg squats x12 (x2)");
                    jLabel7.setText("7.Side lunges x14");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Friday"))
                {
                    jLabel1.setText("1.Jumping jacks x40");
                    jLabel2.setText("2.Push-ups x10");
                    jLabel3.setText("3.Squat x20");
                    jLabel4.setText("4.Split squat x10 each leg");
                    jLabel5.setText("5.Walking lunges x10each leg");
                    jLabel6.setText("6.Shoulder tap x12");
                    jLabel7.setText("7.Plank x45s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Saturday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Push-ups x8");
                    jLabel3.setText("3.Triceps dip x12");
                    jLabel4.setText("4.Split squat x10 each leg");
                    jLabel5.setText("5.Hip trust x12");
                    jLabel6.setText("Burpees x10");
                    jLabel7.setText("7.Side plank x15s each side");
                    jLabel8.setText("8.Stretch");
                }
                else
                {
                    jLabel1.setText("1.Jumping jacks x40");
                    jLabel2.setText("2.Push-ups x10");
                    jLabel3.setText("3.Squat x20");
                    jLabel4.setText("4.Walking lunges x15 (x2)");
                    jLabel5.setText("5.Side lunges x14");
                    jLabel6.setText("6.Russian twist x20");
                    jLabel7.setText("7.Plank x30s");
                    jLabel8.setText("8.Stretch");
                }
            }
            //tedi
            else if(getCel().equals("Lose weight"))
            {
                if(getDay().equals("Monday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Squats x10");
                    jLabel3.setText("3.Lunges x10");
                    jLabel4.setText("4.Fire hydrant x10");
                    jLabel5.setText("5.Wall sit x15s");
                    jLabel6.setText("6.Jumping jacks x10");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Tuesday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Sit-ups x12");
                    jLabel3.setText("3.Bicycle x12");
                    jLabel4.setText("4.Leg raise x12 each leg");
                    jLabel5.setText("5.Plank x30s");
                    jLabel6.setText("6.Jumping jacks x10");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Wednesday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Push-ups x7");
                    jLabel3.setText("3.Shoulder taps x7 (x2)");
                    jLabel4.setText("4.Triceps dips x10");
                    jLabel5.setText("5.Punches x12 each arm");
                    jLabel6.setText("6.Jumping jacks x10");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Thursday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Squats x10");
                    jLabel3.setText("3.Lunges x10");
                    jLabel4.setText("4.Fire hydrant x10");
                    jLabel5.setText("5.Wall sit x10s");
                    jLabel6.setText("6.Jumping jacks x10");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Friday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Sit-ups x12");
                    jLabel3.setText("3.Bicycle x12");
                    jLabel4.setText("4.Leg raise x12 each leg");
                    jLabel5.setText("5.Plank x30s");
                    jLabel6.setText("6.Jumping jacks x10");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Saturday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Push-ups x7");
                    jLabel3.setText("3.Shoulder taps x7 (x2)");
                    jLabel4.setText("4.Triceps dips x10");
                    jLabel5.setText("5.Punches x12 each arm");
                    jLabel6.setText("6.Jumping jacks x10");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
                else
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Squats x10");
                    jLabel3.setText("3.Lunges x10");
                    jLabel4.setText("4.Fire hydrant x10");
                    jLabel5.setText("5.Wall sit x15s");
                    jLabel6.setText("6.Jumping jacks x15");
                    jLabel7.setText("7.Burpees x10");
                    jLabel8.setText("8.Stretch");
                }
            }
            //sofi
            else
            {
                if(getDay().equals("Monday"))
                {
                    jLabel1.setText("1.Jumping jacks x25");
                    jLabel2.setText("2.Incline push-ups x10");
                    jLabel3.setText("3.Knee push-ups x6");
                    jLabel4.setText("4.Split squat x10 each leg");
                    jLabel5.setText("5.Bounce lunge x12 each leg");
                    jLabel6.setText("6.Triceps dip x12");
                    jLabel7.setText("7.Plank x30s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Tuesday"))
                {
                    jLabel1.setText("1.High stepping x35");
                    jLabel2.setText("2.Knee push-ups x8");
                    jLabel3.setText("3.Burpee x12");
                    jLabel4.setText("4.Plank-up x6");
                    jLabel5.setText("5.Inchworm x6");
                    jLabel6.setText("6.Lunge x15 each leg");
                    jLabel7.setText("7.Squat x12");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Wednesday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Plank tap x15");
                    jLabel3.setText("3.Side plank 15s each side");
                    jLabel4.setText("4.Glute bridge x14");
                    jLabel5.setText("5.Flutter kicks 15s");
                    jLabel6.setText("6.Walking squats 30s");
                    jLabel7.setText("7.Curtsy lunge x15 each leg");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Thursday"))
                {
                    jLabel1.setText("1.Jumping jacks x30");
                    jLabel2.setText("2.Triceps dip x15");
                    jLabel3.setText("3.Inchworms x6");
                    jLabel4.setText("4.Cross knee plank x18");
                    jLabel5.setText("5.Heel touch x24");
                    jLabel6.setText("6.Squats x15");
                    jLabel7.setText("7.Side lunges x14");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Friday"))
                {
                    jLabel1.setText("1.Jumping jacks x30");
                    jLabel2.setText("2.Arm scissors 30s");
                    jLabel3.setText("3.Knee push-ups x10");
                    jLabel4.setText("4.Split squat x12 each leg");
                    jLabel5.setText("5.Glute bridge x14");
                    jLabel6.setText("6.Lunge x15 each leg");
                    jLabel7.setText("7.Squats x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Saturday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Knee push-ups x8");
                    jLabel3.setText("3.Triceps dip x12");
                    jLabel4.setText("4.Inchworm x6");
                    jLabel5.setText("5.Side plank 15s each side ");
                    jLabel6.setText("6.Split squat x10 each leg ");
                    jLabel7.setText("7.Lunge x15 each leg ");
                    jLabel8.setText("8.Stretch");
                }
                else
                {
                    jLabel1.setText("1.Jumping jacks x40");
                    jLabel2.setText("2.Arm scissors 30s");
                    jLabel3.setText("3.Plank tap x16");
                    jLabel4.setText("4.Cross knee plank x18");
                    jLabel5.setText("5.Bounce lunge x15 each leg");
                    jLabel6.setText("6.Squat x12");
                    jLabel7.setText("7.Side lunges x14");
                    jLabel8.setText("8.Stretch");
                }
            }
        }
        //muje
        else 
        {
            //iveto
            if(getCel().equals("Stay fit"))
            {
                if(getDay().equals("Monday"))
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Push-ups x12");
                    jLabel3.setText("3.Burpees x40");
                    jLabel4.setText("4.Reverse lunge x15 (x2)");
                    jLabel5.setText("5.Sit-up x20");
                    jLabel6.setText("6.Punches x40 each arm");
                    jLabel7.setText("7.Triceps dip x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Tuesday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Wide hands push-up x12");
                    jLabel3.setText("3.Burpees x30");
                    jLabel4.setText("4.Soulder taps x30 (x2)");
                    jLabel5.setText("5.Walking lunge x12 each leg");
                    jLabel6.setText("6.Squat jump x12");
                    jLabel7.setText("7.Plank x60s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Wednesday"))
                {
                    jLabel1.setText("1.Jumping jacks x40");
                    jLabel2.setText("2.Push-ups x20");
                    jLabel3.setText("3.Squat x30");
                    jLabel4.setText("4.Split squat x16 each leg");
                    jLabel5.setText("5.Triceps dip x25");
                    jLabel6.setText("6.Single leg bridge x12 (x2)");
                    jLabel7.setText("7.Plank x60s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Thursday"))
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Sit-ups x40");
                    jLabel3.setText("3.Squat x20");
                    jLabel4.setText("4.Split squat x16 per side");
                    jLabel5.setText("5.Lunge jumps x16");
                    jLabel6.setText("6.Burpee x30");
                    jLabel7.setText("7.Diamond push-ups x12");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Friday"))
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Push-ups x20");
                    jLabel3.setText("3.Sit-up x20");
                    jLabel4.setText("4.Shoulder tap x12");
                    jLabel5.setText("5.Walking lunge x15 each leg");
                    jLabel6.setText("6.Russian twist x24");
                    jLabel7.setText("7.Plank x60s");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Saturday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Triceps dip x25");
                    jLabel3.setText("3.Squat x30");
                    jLabel4.setText("4.Wide hands push-up x12");
                    jLabel5.setText("5.Lunge x12 each leg");
                    jLabel6.setText("6.Punches x40 each arm");
                    jLabel7.setText("7.Bicycle x40");
                    jLabel8.setText("8.Stretch");
                }
                else
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Push-ups x18");
                    jLabel3.setText("3.Burpees x30");
                    jLabel4.setText("4.Split squat x10 each leg");
                    jLabel5.setText("5.Reverse lunge x12 each leg");
                    jLabel6.setText("6.Shoulder tap x12");
                    jLabel7.setText("7.Plank x60s");
                    jLabel8.setText("8.Stretch");
                }
            }
            //tedi
            else if(getCel().equals("Lose weight"))
            {
                if(getDay().equals("Monday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Push-ups x10");
                    jLabel3.setText("3.Shoulder taps x10 (x2)");
                    jLabel4.setText("4.Triceps dips x10");
                    jLabel5.setText("5.Punches x20 each arm");
                    jLabel6.setText("6.Jumping jacks x25");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Tuesday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Sit-ups x15");
                    jLabel3.setText("3.Bicycle x15");
                    jLabel4.setText("4.Leg raise x15 each leg");
                    jLabel5.setText("5.Plank x30s");
                    jLabel6.setText("6.Jumping jacks x30");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Wednesday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Squats x15");
                    jLabel3.setText("3.Lunges x15");
                    jLabel4.setText("4.Fire hydrant x15");
                    jLabel5.setText("5.Wall sit x15s");
                    jLabel6.setText("6.Jumping jacks x30");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Thursday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Push-ups x10");
                    jLabel3.setText("3.Shoulder taps x10 (x2)");
                    jLabel4.setText("4.Triceps dips x10");
                    jLabel5.setText("5.Punches x20 each arm");
                    jLabel6.setText("6.Jumping jacks x25");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Friday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Sit-ups x15");
                    jLabel3.setText("3.Bicycle x15");
                    jLabel4.setText("4.Leg raise x15 each leg");
                    jLabel5.setText("5.Plank x30s");
                    jLabel6.setText("6.Jumping jacks x25");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Saturday"))
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Squats x15");
                    jLabel3.setText("3.Lunges x15");
                    jLabel4.setText("4.Fire hydrant x15");
                    jLabel5.setText("5.Wall sit x15s");
                    jLabel6.setText("6.Jumping jacks x25");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
                else
                {
                    jLabel1.setText("1.Warm up");
                    jLabel2.setText("2.Push-ups x15");
                    jLabel3.setText("3.Shoulder taps x15 (x2)");
                    jLabel4.setText("4.Triceps dips x15");
                    jLabel5.setText("5.Punches x20 each arm");
                    jLabel6.setText("6.Jumping jacks x25");
                    jLabel7.setText("7.Burpees x20");
                    jLabel8.setText("8.Stretch");
                }
            }
            //sofi
            else
            {
                if(getDay().equals("Monday"))
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Diamond push-up x10");
                    jLabel3.setText("3.Triceps dip x20");
                    jLabel4.setText("4.Oblique crunches x30");
                    jLabel5.setText("5.Sit-ups x20");
                    jLabel6.setText("6.Reverse lunge x24");
                    jLabel7.setText("7.Glute bridge x10 each side");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Tuesday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Wide hands push-up x12");
                    jLabel3.setText("3.Plank tap x20");
                    jLabel4.setText("4.Superman x20");
                    jLabel5.setText("5.Russian twist x30");
                    jLabel6.setText("6.Walking lunge x12 each leg");
                    jLabel7.setText("7.Squat jump x12");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Wednesday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.High-to-low plank x20");
                    jLabel3.setText("3.Triceps dip x25");
                    jLabel4.setText("4.Bird-dog x20");
                    jLabel5.setText("5.Russian twist x30");
                    jLabel6.setText("6.Single leg bridge x24");
                    jLabel7.setText("7.Squat pulses x16");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Thursday"))
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Diamond push-ups x12");
                    jLabel3.setText("3.Side plank 20s each side");
                    jLabel4.setText("4.Floor crunch x20");
                    jLabel5.setText("5.Abdominal air bike x20");
                    jLabel6.setText("6.Lunge jumps x14");
                    jLabel7.setText("7.Split squat x12 each side");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Friday"))
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.High-to-low plank x20");
                    jLabel3.setText("3.Plank tap x22");
                    jLabel4.setText("4.Sit-ups x20");
                    jLabel5.setText("5.Russian twist x30");
                    jLabel6.setText("6.Walking lunge x24");
                    jLabel7.setText("7.Glute bridge x10 each side");
                    jLabel8.setText("8.Stretch");
                }
                else if(getDay().equals("Saturday"))
                {
                    jLabel1.setText("1.High stepping x40");
                    jLabel2.setText("2.Wide hands push-up x12");
                    jLabel3.setText("3.Triceps dip x25");
                    jLabel4.setText("4.Abdominal air bike x20");
                    jLabel5.setText("5.Superman x20");
                    jLabel6.setText("6.Lunge jumps x14");
                    jLabel7.setText("7.Squat pulses x16");
                    jLabel8.setText("8.Stretch");
                }
                else
                {
                    jLabel1.setText("1.Jumping jacks x50");
                    jLabel2.setText("2.Wide hands push-up x12");
                    jLabel3.setText("3.Arm scissors 30s");
                    jLabel4.setText("4.Floor crunch x20");
                    jLabel5.setText("5.Bird-dog x20");
                    jLabel6.setText("6.Split squat x12 each side");
                    jLabel7.setText("7.Reverse lunge x12 (x2)");
                    jLabel8.setText("8.Stretch");
                }
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(543, 451));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(4, 4, 101));
        jButton1.setText("Main Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 4, 101));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("a");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 4, 101));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 4, 101));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 4, 101));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 4, 101));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel1");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 4, 101));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel1");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(4, 4, 101));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel1");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 4, 101));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel1");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(4, 4, 101));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("YOUR WORKOUT FOR TODAY");

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(4, 4, 101));
        jButton2.setText("Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton1)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainPage m = new MainPage();
        m.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "You can do each exercise up to 3 sets!", " ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
