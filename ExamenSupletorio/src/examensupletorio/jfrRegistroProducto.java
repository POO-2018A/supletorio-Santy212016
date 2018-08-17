package examensupletorio;

import examensupletorio.Categorias.ClsAccesorio;
import examensupletorio.Categorias.ClsComponente;
import examensupletorio.Categorias.ClsComputador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jfrRegistroProducto extends javax.swing.JFrame {
    
    ArrayList<Object> productos = new ArrayList<>();
    ClsControlador controlador = new ClsControlador();
    
    public jfrRegistroProducto() {
        initComponents();
        this.setTitle("Registro de Producto");
        this.setLocationRelativeTo(null);
        
        productos = controlador.extraerObjetos("productos.dat");        
        llenarTabla();
    
        pnl_contieneAtributos.setVisible(false);     
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        pnl_contieneAtributos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        pnl_computador = new javax.swing.JPanel();
        lblAlmacenamiento = new javax.swing.JLabel();
        lblRam = new javax.swing.JLabel();
        lblProcesador = new javax.swing.JLabel();
        txtAlmacenamiento = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtProcesador = new javax.swing.JTextField();
        pnl_accesorio = new javax.swing.JPanel();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        pnl_componente = new javax.swing.JPanel();
        lblCapacidad = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        txtVelocidad = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registro de Producto:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Categoría:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "COMPUTADOR", "ACCESORIO", "COMPONENTE" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_contieneAtributos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Tipo:");

        lblAlmacenamiento.setText("Almacenamiento:");

        lblRam.setText("RAM:");

        lblProcesador.setText("Procesador:");

        txtAlmacenamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlmacenamientoKeyTyped(evt);
            }
        });

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_computadorLayout = new javax.swing.GroupLayout(pnl_computador);
        pnl_computador.setLayout(pnl_computadorLayout);
        pnl_computadorLayout.setHorizontalGroup(
            pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_computadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlmacenamiento)
                    .addComponent(lblRam, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProcesador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtRam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(txtAlmacenamiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProcesador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_computadorLayout.setVerticalGroup(
            pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_computadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlmacenamiento)
                    .addComponent(txtAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_computadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcesador))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lblColor.setText("Color:");

        javax.swing.GroupLayout pnl_accesorioLayout = new javax.swing.GroupLayout(pnl_accesorio);
        pnl_accesorio.setLayout(pnl_accesorioLayout);
        pnl_accesorioLayout.setHorizontalGroup(
            pnl_accesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accesorioLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblColor)
                .addGap(18, 18, 18)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_accesorioLayout.setVerticalGroup(
            pnl_accesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accesorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_accesorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCapacidad.setText("Capacidad:");

        lblVelocidad.setText("Velocidad:");

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        txtVelocidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVelocidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_componenteLayout = new javax.swing.GroupLayout(pnl_componente);
        pnl_componente.setLayout(pnl_componenteLayout);
        pnl_componenteLayout.setHorizontalGroup(
            pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_componenteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVelocidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCapacidad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(txtVelocidad))
                .addGap(29, 29, 29))
        );
        pnl_componenteLayout.setVerticalGroup(
            pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_componenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCapacidad)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_componenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_contieneAtributosLayout = new javax.swing.GroupLayout(pnl_contieneAtributos);
        pnl_contieneAtributos.setLayout(pnl_contieneAtributosLayout);
        pnl_contieneAtributosLayout.setHorizontalGroup(
            pnl_contieneAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contieneAtributosLayout.createSequentialGroup()
                .addGroup(pnl_contieneAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_contieneAtributosLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel12)
                        .addGap(39, 39, 39)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_computador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_contieneAtributosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_componente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_contieneAtributosLayout.setVerticalGroup(
            pnl_contieneAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contieneAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contieneAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(pnl_computador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_componente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegistrar.setText("Registrar Producto");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Marca", "Categoria", "Atributos adicionales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(pnl_contieneAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnSalir)))
                    .addComponent(pnl_contieneAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        
        if (cmbCategoria.getSelectedIndex() == 1) {
            System.out.println("COMPUTADOR");
            txtTipo.setEnabled(true);
            pnl_contieneAtributos.setVisible(true);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(true);
            
        }else if (cmbCategoria.getSelectedIndex() == 2) {
            System.out.println("ACCESORIO");
            txtTipo.setEnabled(true);
            pnl_contieneAtributos.setVisible(true);
            pnl_accesorio.setVisible(true);
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(false);
            
        }else if (cmbCategoria.getSelectedIndex() == 3) {
            System.out.println("COMPONENTE");
            txtTipo.setEnabled(true);
            pnl_contieneAtributos.setVisible(true);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(true);
            pnl_computador.setVisible(false);
            
        }else {//bloquea todo
            txtTipo.setEnabled(false);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(false);
        }
        
        
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(txtNombre.getText().equals("") || txtPrecio.getText().equals("") || txtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Llene todos los campos","ERROR!!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (cmbCategoria.getSelectedIndex() == 1) {
            ArrayList<String> atributosAdicioneles = new ArrayList<>();
            System.out.println("COMPUTADOR");
            ClsComputador producto = new ClsComputador(txtNombre.getText(), Double.parseDouble(txtPrecio.getText()),txtMarca.getText(), (String) cmbCategoria.getSelectedItem(), txtTipo.getText(), Integer.parseInt(txtAlmacenamiento.getText()), Integer.parseInt(txtRam.getText()), txtProcesador.getText());
            productos.add(producto);
            System.out.println(producto.getTipo());
            controlador.escribirObjeto("productos.dat", productos);
            productos = controlador.extraerObjetos("productos.dat");
            limpiar();
            atributosAdicioneles.add("Tipo:"+producto.getTipo()+" Almacenamiento:"+producto.getAlmacenamiento()+" Ram:"+ producto.getRam()+ " Procesador"+producto.getProcesador());
            Object prodcutoT [] = {producto.getNombre(), producto.getPrecio(),producto.getMarca(),producto.getCategoria(), atributosAdicioneles};
            DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
            model.addRow(prodcutoT);
            
            
        }else if (cmbCategoria.getSelectedIndex() == 2) {
            ArrayList<String> atributosAdicioneles = new ArrayList<>();
            System.out.println("ACCESORIO");
            ClsAccesorio producto = new ClsAccesorio(txtNombre.getText(), Double.parseDouble(txtPrecio.getText()),txtMarca.getText(), (String) cmbCategoria.getSelectedItem(), txtTipo.getText(), txtColor.getText());
            productos.add(producto);
            controlador.escribirObjeto("productos.dat", productos);
            productos = controlador.extraerObjetos("productos.dat");
            limpiar();
            atributosAdicioneles.add("Tipo:"+producto.getTipo()+" Color:"+producto.getColor());
            Object prodcutoT [] = {producto.getNombre(), producto.getPrecio(),producto.getMarca(),producto.getCategoria(), atributosAdicioneles};
            DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
            model.addRow(prodcutoT);
            
            
        }else if (cmbCategoria.getSelectedIndex() == 3) {
            ArrayList<String> atributosAdicioneles = new ArrayList<>();
            System.out.println("COMPONENTE");
            ClsComponente producto = new ClsComponente(txtNombre.getText(), Double.parseDouble(txtPrecio.getText()),txtMarca.getText(), (String) cmbCategoria.getSelectedItem(), txtTipo.getText(), Integer.parseInt(txtCapacidad.getText()), Integer.parseInt(txtVelocidad.getText()));
            productos.add(producto);
            controlador.escribirObjeto("productos.dat", productos);
            productos = controlador.extraerObjetos("productos.dat");
            limpiar();
            atributosAdicioneles.add("Tipo:"+producto.getTipo()+" Capacidad:"+producto.getCapacidad()+" Velocidad:"+ producto.getVelocidad());
            Object prodcutoT [] = {producto.getNombre(), producto.getPrecio(),producto.getMarca(),producto.getCategoria(), atributosAdicioneles};
            DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
            model.addRow(prodcutoT);
            atributosAdicioneles.remove(0);
            
        }else {//bloquea todo
            JOptionPane.showMessageDialog(null,"Selecione una Categoria","ERROR!!",JOptionPane.ERROR_MESSAGE);
            pnl_accesorio.setVisible(false);
            pnl_componente.setVisible(false);
            pnl_computador.setVisible(false);
        }
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtAlmacenamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlmacenamientoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        int numero_caracteres = 10;
        if (txtAlmacenamiento.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAlmacenamientoKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txtRam.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txtCapacidad.getText().length() >= numero_caracteres) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void txtVelocidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVelocidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();//Solo permite numeros
        }
        int numero_caracteres = 10;
        if (txtVelocidad.getText().length() >= numero_caracteres) {//Permite solo 10 digitos
            evt.consume();
        }
    }//GEN-LAST:event_txtVelocidadKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfrRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrRegistroProducto().setVisible(true);
            }
        });
    }
    
    
    public void llenarTabla(){
        
        if(productos.size() > 0){
            ClsProducto producto =  new ClsProducto();
            DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
            for(int i = 0; i < productos.size(); i ++){
                producto = (ClsProducto) productos.get(i);
                Object productoT [] = {producto.getNombre(), producto.getPrecio(), producto.getMarca(), producto.getCategoria()};
                model.insertRow(i, productoT);
            }
        }
    }
    
    public void limpiar(){
        txtNombre.setText(null);
        txtPrecio.setText(null);
        txtMarca.setText(null);
        cmbCategoria.setSelectedIndex(0);
        txtTipo.setText(null);
        txtAlmacenamiento.setText(null);
        txtRam.setText(null);
        txtProcesador.setText(null);
        txtColor.setText(null);
        txtCapacidad.setText(null);
        txtVelocidad.setText(null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlmacenamiento;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JPanel pnl_accesorio;
    private javax.swing.JPanel pnl_componente;
    private javax.swing.JPanel pnl_computador;
    private javax.swing.JPanel pnl_contieneAtributos;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtAlmacenamiento;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}
