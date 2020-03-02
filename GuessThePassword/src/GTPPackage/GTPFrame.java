/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GTPPackage;
import com.sun.nio.sctp.MessageInfo;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicBorders;
import sun.tools.jar.CommandLine;
/**
 *
 * @author Ravi patelL
 */
public class GTPFrame extends javax.swing.JFrame {

    /**
     * Creates new form GTPFrame
     */

    

    
    public GTPFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Initialize();
        
    }

    private void submit(){
      String pass = jPasswordField1.getText();

        
        int l = pass.length();
        int ecount = 0;
        try{
        if(l == 4)
        {
            
            int p = Integer.valueOf(pass);
            int h[] = new int[5];
            for(int i=4;i>=1;i--)
            {
                h[i] = p%10; 
                p = p/10;
            
            }
            for(int u=1;u<=4;u++)
            {
                
                if(h[u]== 0)
                {
                ecount = 1;
                }
                else if(h[u]== 9)
                {
                ecount = 1;
                }
            }
            if(ecount>0)
            {
                JOptionPane.showMessageDialog(this,"Enter 1 to 8 numbers","Alert",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.enable(true);
                jPasswordField1.setText("");
                  
            }
            else if((h[1] == h[2]) || (h[1] == h[3]) || (h[1] == h[4]) || (h[2] == h[3]) || (h[2] == h[4]) || (h[3] == h[4]))
            {
                JOptionPane.showMessageDialog(this,"Don't Enter Repeated Number","Alert",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.enable(true);
                jPasswordField1.setText("");
            }
            else
            {
                jPasswordField1.enable(false);
                JOptionPane.showMessageDialog(this,"Password Accepted \n Lets Go!!!","Be Ready",JOptionPane.INFORMATION_MESSAGE);
                jButton14.setEnabled(false);
                jTextField1.enable(true);
                jButton1.setEnabled(false);
            }            
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Enter 4 Digit Number Only","Alert",JOptionPane.ERROR_MESSAGE);
            jPasswordField1.enable(true);
            jPasswordField1.setText("");
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Do Not Use Special Character Or Alphabets \nUse Numbers only","Alert",JOptionPane.INFORMATION_MESSAGE);
             jPasswordField1.enable(true);
             jPasswordField1.setText("");
        }
            
  }
    
    public void Initialize(){
        
        jTextField1.enable(false);
        jTextField2.enable(false);
        jTextField3.enable(false);
        jTextField4.enable(false);
        jTextField5.enable(false);
        jTextField6.enable(false);
        jTextField7.enable(false);
        jTextField8.enable(false);
        jTextField9.enable(false);
        jTextField10.enable(false);
        
    }
    
    private void ResetGame(){
        Initialize();
        
        jPasswordField1.enable(true);
        
        jPasswordField1.setText("");
        
        jButton1.setEnabled(true);
        jButton14.setEnabled(true);
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        
    }
 
    private void check1(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField1.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField11.setText(Integer.toString(ca));
    jTextField12.setText(Integer.toString(cb));
    jTextField1.enable(false);
    /*jTextField11.enable(false);        
    jTextField12.enable(false);*/    
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check2(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField2.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField13.setText(Integer.toString(ca));
    jTextField14.setText(Integer.toString(cb));
    jTextField2.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}

    private void check3(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField3.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField15.setText(Integer.toString(ca));
    jTextField16.setText(Integer.toString(cb));
    jTextField3.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check4(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField4.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField17.setText(Integer.toString(ca));
    jTextField18.setText(Integer.toString(cb));
    jTextField4.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check5(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField5.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField19.setText(Integer.toString(ca));
    jTextField20.setText(Integer.toString(cb));
    jTextField5.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check6(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField6.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField21.setText(Integer.toString(ca));
    jTextField22.setText(Integer.toString(cb));
    jTextField6.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check7(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField7.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField23.setText(Integer.toString(ca));
    jTextField24.setText(Integer.toString(cb));
    jTextField7.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check8(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField8.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField25.setText(Integer.toString(ca));
    jTextField26.setText(Integer.toString(cb));
    jTextField8.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check9(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField9.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField27.setText(Integer.toString(ca));
    jTextField28.setText(Integer.toString(cb));
    jTextField9.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Won","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
}
    
    private void check10(){       
        String pass = jPasswordField1.getText();
        int p = Integer.valueOf(pass);
        int i[] = new int[5];
        for(int k=4;k>=1;k--)
        {
            i[k] = p%10; 
            p = p/10;
            
        }
        
        String text = jTextField10.getText();
        int t = Integer.valueOf(text);
        int j[] = new int[5];
        for(int l=4;l>=1;l--)
        {
            j[l] = t%10; 
            t = t/10;
            
        }
        
        int ca = 0;
        int cb = 0;

        int a[] = new int[9];
        a[i[1]] += 1;
        a[i[2]] += 1;
        a[i[3]] += 1;
        a[i[4]] += 1;
        
        int b[] = new int[9];
        b[j[1]] += 1;
        b[j[2]] += 1;
        b[j[3]] += 1;
        b[j[4]] += 1;
        
        for(int g=1;g<=8;g++)
        {
            if(b[g]!=0)
            {
                if(a[g]>b[g])
                {
                    ca += b[g];
                }
                else
                {
                    ca += a[g]; 
                }
            }
        }
        
    if(j[1] == i[1] )
    {
        ca -= 1;
        cb += 1;
    }
        
    if(j[2] == i[2] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[3] == i[3] )
    {
        ca -= 1;
        cb += 1;
    }
    if(j[4] == i[4] )
    {
        ca -= 1;
        cb += 1;
    }
        
    jTextField29.setText(Integer.toString(ca));
    jTextField30.setText(Integer.toString(cb));
    jTextField10.enable(false);
       
        if(cb == 4)
        {
            JOptionPane.showMessageDialog(this,"You Win","Result !!!",JOptionPane.INFORMATION_MESSAGE);
            ResetGame();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You Failed\n Password:" +pass,"Result !!!",JOptionPane.INFORMATION_MESSAGE);
            
            ResetGame();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField31 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(51, 51, 51)));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Guess The ");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Password???");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GTPPackage/think3.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Enter Password:");

        jPasswordField1.setBackground(new java.awt.Color(153, 255, 153));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GTPPackage/th9F83ZDI5.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText(" Check ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText(" Check ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText(" Check ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText(" Check ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText(" Check ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText(" Check ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText(" Check ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText(" Check ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton12.setText(" Check ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setText(" Check ");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("1.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("2.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("3.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("4.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("5.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("6.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("7.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("8.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("9.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("10.");

        jTextField11.setEditable(false);
        jTextField11.setText("       ");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setText("       ");

        jTextField13.setEditable(false);
        jTextField13.setText("       ");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setText("       ");

        jTextField15.setEditable(false);
        jTextField15.setText("       ");

        jTextField16.setEditable(false);
        jTextField16.setText("       ");

        jTextField17.setEditable(false);
        jTextField17.setText("       ");

        jTextField18.setEditable(false);
        jTextField18.setText("       ");

        jTextField19.setEditable(false);
        jTextField19.setText("       ");

        jTextField20.setEditable(false);
        jTextField20.setText("       ");

        jTextField21.setEditable(false);
        jTextField21.setText("       ");

        jTextField22.setEditable(false);
        jTextField22.setText("       ");

        jTextField23.setEditable(false);
        jTextField23.setText("       ");

        jTextField24.setEditable(false);
        jTextField24.setText("       ");

        jTextField25.setEditable(false);
        jTextField25.setText("       ");

        jTextField26.setEditable(false);
        jTextField26.setText("       ");

        jTextField27.setEditable(false);
        jTextField27.setText("       ");

        jTextField28.setEditable(false);
        jTextField28.setText("       ");

        jTextField29.setEditable(false);
        jTextField29.setText("       ");

        jTextField30.setEditable(false);
        jTextField30.setText("       ");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GTPPackage/Map_symbol_info_point_02.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GTPPackage/Map_symbol_info_point_02.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTextField31.setBackground(new java.awt.Color(204, 255, 204));
        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField31.setText("  Answers ");
        jTextField31.setBorder(null);
        jTextField31.setCaretColor(new java.awt.Color(204, 0, 0));
        jTextField31.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jTextField31.setSelectedTextColor(new java.awt.Color(255, 153, 153));

        jButton14.setBackground(new java.awt.Color(102, 255, 102));
        jButton14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton14.setText("Auto Submit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(0, 146, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jButton1)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton12))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 484, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField9)
                            .addComponent(jTextField10)
                            .addComponent(jTextField8)
                            .addComponent(jTextField1)
                            .addComponent(jTextField31))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField11))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton13)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton12)
                                    .addComponent(jLabel13)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        submit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     JOptionPane.showMessageDialog(this,"1. Enter 4 digit Number \n2. Enter Numbers from 1 to 8 only\n3. Do not Enter Repeated Numbers","Instructions:",JOptionPane.INFORMATION_MESSAGE);
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this,"Right Numbers \nWrong Place ","Instructions:",JOptionPane.INFORMATION_MESSAGE);
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
JOptionPane.showMessageDialog(this,"Right Numbers \nRight Place ","Instructions:",JOptionPane.INFORMATION_MESSAGE);
     
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField2.enable(true);
        check1();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField3.enable(true);
        check2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField4.enable(true);
        check3();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField5.enable(true);
        check4();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField6.enable(true);
        check5();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTextField8.enable(true);
        check7();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField7.enable(true);
        check6();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        check10(); 
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       jTextField9.enable(true);
       check8();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       jTextField10.enable(true);
       check9();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        //Auto Submit 
        int ecount = 0;
        String pas = "";
        int h[] = new int[5];
                     
        for(int k=1;k<=10000;k++)
        {
            int p =0;
            ecount = 0;
            jPasswordField1.setText("");
            
            pas = "";
            p =  1234 + (int) (Math.random() *7532 );
            
            pas += p;
            jPasswordField1.setText(pas);
            
            
            for(int i=4;i>=1;i--)
            {
                h[i] = p%10; 
                p = p/10;
            }
            
            for(int u=1;u<=4;u++)
            {
                if(h[u]== 0)
                {
                ecount = 1;
                }
                else if(h[u]== 9)
                {
                ecount = 1;
                }
            }
            if(ecount>0)
            {
                
            }
            else if((h[1] == h[2]) || (h[1] == h[3]) || (h[1] == h[4]) || (h[2] == h[3]) || (h[2] == h[4]) || (h[3] == h[4]))
            {
                
            }
            else
            {
                 //JOptionPane.showMessageDialog(this,"Password Accepted \n Lets Go!!!","Be Ready",JOptionPane.INFORMATION_MESSAGE);
                 break;
            }
        }
        
      
        
        jPasswordField1.enable(false);
        JOptionPane.showMessageDialog(this,"Password Accepted \n Lets Go!!!","Be Ready",JOptionPane.INFORMATION_MESSAGE);
        jButton14.setEnabled(false);
        jTextField1.enable(true);
        jButton1.setEnabled(false);
        

    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GTPFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
