package GUI;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Main.Jugadores;

public class Pantalla extends javax.swing.JFrame {
   
    public Pantalla() {
        initComponents();
    }
                     
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo_Lbl = new javax.swing.JLabel();
        score_Lbl = new javax.swing.JLabel();
        nombre_Lbl = new javax.swing.JLabel();
        nivel_Lbl = new javax.swing.JLabel();
        juegoFav_Lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        id_Txt = new javax.swing.JTextField();
        id_Lbl = new javax.swing.JLabel();
        buscar_Btn = new javax.swing.JButton();
        editar_Btn = new javax.swing.JButton();
        eliminar_Btn = new javax.swing.JButton();
        score_Txt = new javax.swing.JTextField();
        nombre_Txt = new javax.swing.JTextField();
        juegoFav_Txt = new javax.swing.JTextField();
        nivel_Txt = new javax.swing.JTextField();
        guardar_Btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoJugadores_textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        titulo_Lbl.setFont(new java.awt.Font("Roboto Medium", 2, 36)); // NOI18N
        titulo_Lbl.setForeground(new java.awt.Color(255, 255, 255));
        titulo_Lbl.setText("PlayerVault");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(titulo_Lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo_Lbl)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        score_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        score_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_Lbl.setText("Score:");

        nombre_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nombre_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_Lbl.setText("Nombre del Jugador:");

        nivel_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nivel_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nivel_Lbl.setText("Nivel del Jugador:");

        juegoFav_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        juegoFav_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juegoFav_Lbl.setText("Juego Favorito:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        id_Txt.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        id_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        id_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_Lbl.setText("ID:");

        buscar_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        buscar_Btn.setForeground(new java.awt.Color(0, 51, 255));
        buscar_Btn.setText("Buscar");
        buscar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_BtnActionPerformed(evt);
            }
        });

        editar_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        editar_Btn.setForeground(new java.awt.Color(51, 204, 0));
        editar_Btn.setText("Editar");
        editar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_BtnActionPerformed(evt);
            }
        });

        eliminar_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        eliminar_Btn.setForeground(new java.awt.Color(255, 51, 51));
        eliminar_Btn.setText("Eliminar");
        eliminar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_BtnActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(id_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(buscar_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editar_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar_Btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_Lbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscar_Btn)
                        .addComponent(editar_Btn)
                        .addComponent(eliminar_Btn)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        score_Txt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        nombre_Txt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        juegoFav_Txt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        
        nivel_Txt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        nivel_Txt.setToolTipText("P' principiante, 'I' Intermedio o 'A' Avanzado");


        guardar_Btn.setBackground(new java.awt.Color(0, 51, 204));
        guardar_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        guardar_Btn.setForeground(new java.awt.Color(255, 255, 255));
        guardar_Btn.setText("Guardar");
        guardar_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_BtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        infoJugadores_textArea.setEditable(false);
        infoJugadores_textArea.setBackground(new java.awt.Color(255, 255, 255));
        infoJugadores_textArea.setColumns(20);
        infoJugadores_textArea.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        infoJugadores_textArea.setRows(5);
        jScrollPane1.setViewportView(infoJugadores_textArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_Lbl)
                            .addComponent(nivel_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivel_Lbl))
                        .addGap(46, 46, 46)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(juegoFav_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(juegoFav_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(score_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addComponent(score_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)))
                                .addComponent(guardar_Btn))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_Lbl)
                    .addComponent(juegoFav_Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(juegoFav_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(score_Lbl)
                            .addComponent(nivel_Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nivel_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(guardar_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                       

    private void guardar_BtnActionPerformed(java.awt.event.ActionEvent evt) {
        addJugador();
    }

    private void buscar_BtnActionPerformed(java.awt.event.ActionEvent evt) {
        buscarJugador();
    }

    private void editar_BtnActionPerformed(java.awt.event.ActionEvent evt) {
        editarJugador();
    }

    private void eliminar_BtnActionPerformed(java.awt.event.ActionEvent evt) {
        eliminarJugador();
        listarJugadores();
    }
   
    private static javax.swing.JPanel background;
    private static javax.swing.JButton buscar_Btn;
    private static javax.swing.JButton editar_Btn;
    private static javax.swing.JButton eliminar_Btn;
    private static javax.swing.JButton guardar_Btn;
    private static javax.swing.JLabel id_Lbl;
    private static javax.swing.JTextField id_Txt;
    private static javax.swing.JTextArea infoJugadores_textArea;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel3;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel juegoFav_Lbl;
    private static javax.swing.JTextField juegoFav_Txt;
    private static javax.swing.JLabel nivel_Lbl;
    private static javax.swing.JTextField nivel_Txt;
    private static javax.swing.JLabel nombre_Lbl;
    private static javax.swing.JTextField nombre_Txt;
    private static javax.swing.JLabel score_Lbl;
    private static javax.swing.JTextField score_Txt;
    private static javax.swing.JLabel titulo_Lbl;                 

    static ArrayList<Jugadores> jugadores = new ArrayList<>();
    
    public static void addJugador() {
        Jugadores jugador = new Jugadores(nombre_Txt.getText(), nivel_Txt.getText().charAt(0), juegoFav_Txt.getText(), Integer.parseInt(score_Txt.getText()));
        jugadores.add(jugador);
        limpiarCasillas();
        listarJugadores();
    }

    public static void limpiarCasillas() {
        id_Txt.setText("");
        nombre_Txt.setText("");
        nivel_Txt.setText("");
        juegoFav_Txt.setText("");
        score_Txt.setText("");
    }
    
    static void listarJugadores(){
        infoJugadores_textArea.setText("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("************Listado de Jugadores***************\n");
        for(Jugadores jugador: jugadores)
        stringBuilder.append("\nId: ").append(jugador.getId()).append(" |  Nombre del Jugador: ").append(jugador.getNombre()).append(" |  Puntaje: ").append(jugador.getScore()).append("\n");
        infoJugadores_textArea.setText(stringBuilder.toString());
    }


    static void buscarJugador() {
        int id = Integer.parseInt(id_Txt.getText());
        boolean encontrado = false;
        for (Jugadores jugador : jugadores) {
            if (jugador.getId() == id) {
                nombre_Txt.setText(jugador.getNombre());
                juegoFav_Txt.setText(jugador.getJuegoFavorito());
                score_Txt.setText(String.valueOf(jugador.getScore()));
                nivel_Txt.setText(Character.toString(jugador.getNivel()));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún jugador con el ID especificado", "Buscar jugador", JOptionPane.ERROR_MESSAGE);
            limpiarCasillas();
        }
    }
    
    static void eliminarJugador() {
        int id = Integer.parseInt(id_Txt.getText());
        for (Jugadores jugador : jugadores) {
            if (jugador.getId() == id) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar al jugador con ID: " + jugador.getId() + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    jugadores.remove(jugador);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el jugador con ID: " + jugador.getId(), "Eliminar jugador", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Se ha eliminado el jugador " + jugador.getId());
                    limpiarCasillas();
                }
                break; 
            }
        }
    }
    

    static void editarJugador() {
        int id = Integer.parseInt(id_Txt.getText());
        for (Jugadores jugador : jugadores) {
            if (jugador.getId() == id) {
                jugador.setNombre(nombre_Txt.getText());
                jugador.setNivel(nivel_Txt.getText().charAt(0));
                jugador.setJuegoFavorito(juegoFav_Txt.getText());
                jugador.setScore(Integer.parseInt(score_Txt.getText()));
                
                JOptionPane.showMessageDialog(null, "Se ha editado el jugador con ID: " + jugador.getId(), "Editar jugador", JOptionPane.INFORMATION_MESSAGE);
                limpiarCasillas();
                listarJugadores();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró ningún jugador con el ID especificado", "Editar jugador", JOptionPane.ERROR_MESSAGE);
    }
    
}
