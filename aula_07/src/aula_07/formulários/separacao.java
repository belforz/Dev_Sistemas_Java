
package aula_07.formulários;

/**
 *
 * @author maced
 */
public class separacao {
    public javax.swing.JTextField txt_n1;
    public javax.swing.JTextField txt_n2;
    public javax.swing.JTextField txt_res;
    
 public void Desabilitar(){
 txt_n1.setEditable(false);
 txt_n2.setEditable(false);
 txt_res.setEditable(false);

 }
public void Habilitar(){
 txt_n1.setEditable(true);
 txt_n2.setEditable(true);
 txt_res.setEditable(true);

 } 
    
}
