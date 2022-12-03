import javax.swing.*;
public class Matriz01 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num[] [] = new int [6] [3], i, j = 0, maior = 0, menor, lin = 0, col = 0;
        for (i = 0;  i < 6; i++)
        {
            for (j = 0; j < 3; j ++)
            {
                num[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
            }
        }
        for (i = 0; i < 6; i ++)
        {
            for (j = 0;j  < 3;j   ++)
            {
                if (num[i][j] > maior)
                {
                    maior = num [i][j];
                    lin = i;
                    col = j;
                }
            }
        }
        lin ++;
        col ++;
        JOptionPane.showMessageDialog(null,"Maior valor " + maior + " na linha " + lin + " coluna " + col);
        menor = num[0][0];
        for (i = 0; i < 6; i ++)
        {
            for (j = 0; j<3;j++)
            {
                if (num[i][j] < menor)
                {
                    menor = num [i][j];
                    lin = i;
                    col = j;
                }
            }
        }
        lin ++;
        col ++;
        JOptionPane.showMessageDialog(null,"Menor valor " + menor + " na linha " + lin + " coluna " + col);
    }

}