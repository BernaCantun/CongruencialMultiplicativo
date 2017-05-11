package Modelo_Congruencial_Multiplicativo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
 
public class Comprobacion extends JFrame implements ActionListener {
 
    public Comprobacion(){
        //Para poder cerrar la ventana
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 
        //Se agrega un layout
        setLayout( new BorderLayout() );
 
        //Se crea el editor de texto y se agrega a un scroll
        txp = new JTextPane();
        JScrollPane jsp = new JScrollPane();
        jsp.setViewportView( txp );
 
        add( jsp, BorderLayout.CENTER );
 
        //Se crea un boton para abrir el archivo
        JButton btn = new JButton( "Abrir" );
        JButton btn2 = new JButton("Metodo");
        btn2.addActionListener(this);
        btn.addActionListener( this );
        btn.setIcon( new ImageIcon( getClass().getResource( "" ) ) );
        btn2.setIcon(new ImageIcon( getClass().getResource("") ) );
 
        add( btn, BorderLayout.NORTH );
        add(btn2, BorderLayout.SOUTH);
        //TamaÃ±o de la ventana
        setSize( 500, 500 );
        setSize(500,500);
 
        //Esto sirve para centrar la ventana
        setLocationRelativeTo( null );
   
        //Hacemos visible la ventana
        setVisible( true );
    }
 
    //------------------------------Action Performed-------------------------------//
    public void actionPerformed( ActionEvent e ){
        JButton btn = (JButton)e.getSource();
        if( btn.getText().equals( "Abrir" ) )
        {
            if( abrirArchivo == null ) abrirArchivo = new JFileChooser();
            //Con esto solamente podamos abrir archivos
            abrirArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
 
            int seleccion = abrirArchivo.showOpenDialog( this );
 
            if( seleccion == JFileChooser.APPROVE_OPTION )
            {
                File f = abrirArchivo.getSelectedFile();
                try
                {
                    String nombre = f.getName();
                    String path = f.getAbsolutePath();
                    String contenido = getArchivo( path );
                    //Colocamos en el titulo de la aplicacion el 
                    //nombre del archivo
                    this.setTitle( nombre );
 
                    //En el editor de texto colocamos su contenido
                    txp.setText( contenido );
 
                }catch( Exception exp){}
            }
        }else {
        
          Metodo met = new Metodo();
       met.setVisible(true);
       this.dispose();}
    }
  
      
    //-----------------------------------------------------------------------------//
 
    //-------------------------Se obtiene el contenido del Archivo----------------//
    public String getArchivo( String ruta ){
        FileReader fr = null;
        BufferedReader br = null;
        //Cadena de texto donde se guardara el contenido del archivo
        String contenido = "";
        try
        {
            //ruta puede ser de tipo String o tipo File
            fr = new FileReader( ruta );
            br = new BufferedReader( fr );
 
            String linea;
            //Obtenemos el contenido del archivo linea por linea
            while( ( linea = br.readLine() ) != null ){ 
                contenido += linea + "\n";
            }
 
        }catch( Exception e ){  }
        //finally se utiliza para que si todo ocurre correctamente o si ocurre 
        //algun error se cierre el archivo que anteriormente abrimos
        finally
        {
            try{
                br.close();
            }catch( Exception ex ){}
        }
        return contenido;
    }
    //-----------------------------------------------------------------------------//
 
    public static void main( String[] arg ){
        try
        {
            //Cambiamos el Look&Feel
            JFrame.setDefaultLookAndFeelDecorated( true );
            UIManager.setLookAndFeel( new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel() );
        }catch( Exception e ){}
        new Comprobacion();
    }
 
    JTextPane txp;
    JFileChooser abrirArchivo;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}