package warships.vikar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import warships.vikar.ship;
/*
 * Vikar 2012-2013
 */

public class desk extends javax.swing.JFrame {

     boolean  draw = false;
     int mouse_x, mouse_y;
     static element desk_el[][] = new element[10][10];
     int example[] = new int[10];
            

//----Ship Declaration----//
    
    static ship my_ship[] = new ship[10];
    static ship computer_ship[] = new ship[10];
    
    
    static void declare_ship_properties()
    {
        for(int i=0;i<4;i++)
        {
            my_ship[i].scout=1;
            computer_ship[i].scout = 1;
            my_ship[i].elem[0].head = true;
            my_ship[i].elem[0].end = true;
            my_ship[i].elem[0].next = null;
            my_ship[i].elem[0].prev = null; 
            
            
        }
        for(int i = 4;i<7;i++)
        {
            my_ship[i].scout=2;
            computer_ship[i].scout = 2;
            my_ship[i].elem[0].head = true;
            my_ship[i].elem[0].end = true;
            my_ship[i].elem[0].next = null;
            my_ship[i].elem[0].prev = null;   
        }
    }
    
    public static void create_free_elems()
    {
        for(int i = 1;i<11;i++)
        {
            for(int j = 1;j<11;j++)
            {
                //desk_el[i-1][j-1].x=i;
                //desk_el[i-1][j-1].y=j;
                desk_el[i-1][j-1].fplace=true;
            }
        }
    }
    
    
    
    public void draw_warplace()
  
    {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desk_panel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                desk_panelMouseWheelMoved(evt);
            }
        });
        desk_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                desk_panelMousePressed(evt);
            }
        });

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout desk_panelLayout = new javax.swing.GroupLayout(desk_panel);
        desk_panel.setLayout(desk_panelLayout);
        desk_panelLayout.setHorizontalGroup(
            desk_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desk_panelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 825, Short.MAX_VALUE))
        );
        desk_panelLayout.setVerticalGroup(
            desk_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desk_panelLayout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
          
        
        Graphics g=desk_panel.getGraphics();
        g.setClip(0,0,desk_panel.getWidth(),desk_panel.getHeight());
        Graphics g2 = (Graphics2D)g; 
        create_free_elems();
        //desk_el[1][1].fplace=false;
        for(int i=1;i<11;i++)
     {
         for(int j = 1;j<11;j++)
         {
             g.drawRect(i*35,j*35,35,35);
         }
     }
        for(int i =12;i<22;i++)
     {
         for(int j = 1;j<11;j++)
         {
             g.drawRect(i*35,j*35,35,35);
         }
     }
        draw = true;
    }
    
    public desk() {
        initComponents();
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void desk_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_panelMousePressed
        for(int i=0;i<10;i++)
        {
            example[i]=i;
        }
        
        if(draw)
        {
            Graphics g=desk_panel.getGraphics();
            g.setClip(0,0,desk_panel.getWidth(),desk_panel.getHeight());
            Graphics g2 = (Graphics2D)g; 
            int in_x, in_y;
            in_x = desk_panel.getMousePosition().x/35;
            in_y = desk_panel.getMousePosition().y/35;
            System.out.println(in_x+" x "+in_y);
            
            if(in_x>11&&in_y>0&&in_x<22&&in_y<12)
            {
                if(desk_el[in_x-12][in_y-1].fplace==true){
                g.fillOval(in_x*35+10, in_y*35+10, 15, 15);
                }
                if(desk_el[in_x-12][in_y-1].fplace==false) {
                    g.drawLine(in_x*35, in_y*35, in_x*35+35, in_y*35+35);
                    g.drawLine(in_x*35+35, in_y*35, in_x*35, in_y*35+35);
                }
            }
                   
          
            
        }
        
    }//GEN-LAST:event_desk_panelMousePressed

    private void desk_panelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_desk_panelMouseWheelMoved
       int in_x = desk_panel.getMousePosition().x/35;
       int in_y = desk_panel.getMousePosition().y/35;
       desk_el[in_x-12][in_y-1].fplace=false;     
       example[3]=25;

    }//GEN-LAST:event_desk_panelMouseWheelMoved

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new desk().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel desk_panel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
   
}