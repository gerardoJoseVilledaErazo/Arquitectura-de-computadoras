namespace Ejemplo04
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rdbtnSuma = new System.Windows.Forms.RadioButton();
            this.rdbtnResta = new System.Windows.Forms.RadioButton();
            this.rdbtnMulti = new System.Windows.Forms.RadioButton();
            this.btnProcesar = new System.Windows.Forms.Button();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtNumero1 = new System.Windows.Forms.TextBox();
            this.txtNumero2 = new System.Windows.Forms.TextBox();
            this.labelResultado = new System.Windows.Forms.Label();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.btnHilo1 = new System.Windows.Forms.Button();
            this.btnHilo2 = new System.Windows.Forms.Button();
            this.pgrBarHilo1 = new System.Windows.Forms.ProgressBar();
            this.pgrBarHilo2 = new System.Windows.Forms.ProgressBar();
            this.Hilo1 = new System.ComponentModel.BackgroundWorker();
            this.Hilo2 = new System.ComponentModel.BackgroundWorker();
            this.btnPausa1 = new System.Windows.Forms.Button();
            this.btnPausa2 = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox3.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.rdbtnMulti);
            this.groupBox1.Controls.Add(this.rdbtnResta);
            this.groupBox1.Controls.Add(this.rdbtnSuma);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(200, 157);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Operadores Aritmeticos";
            // 
            // rdbtnSuma
            // 
            this.rdbtnSuma.AutoSize = true;
            this.rdbtnSuma.Location = new System.Drawing.Point(16, 33);
            this.rdbtnSuma.Name = "rdbtnSuma";
            this.rdbtnSuma.Size = new System.Drawing.Size(65, 21);
            this.rdbtnSuma.TabIndex = 0;
            this.rdbtnSuma.TabStop = true;
            this.rdbtnSuma.Text = "Suma";
            this.rdbtnSuma.UseVisualStyleBackColor = true;
            this.rdbtnSuma.CheckedChanged += new System.EventHandler(this.rdbtnSuma_CheckedChanged);
            // 
            // rdbtnResta
            // 
            this.rdbtnResta.AutoSize = true;
            this.rdbtnResta.Location = new System.Drawing.Point(16, 60);
            this.rdbtnResta.Name = "rdbtnResta";
            this.rdbtnResta.Size = new System.Drawing.Size(66, 21);
            this.rdbtnResta.TabIndex = 1;
            this.rdbtnResta.TabStop = true;
            this.rdbtnResta.Text = "Resta";
            this.rdbtnResta.UseVisualStyleBackColor = true;
            this.rdbtnResta.CheckedChanged += new System.EventHandler(this.rdbtnResta_CheckedChanged);
            // 
            // rdbtnMulti
            // 
            this.rdbtnMulti.AutoSize = true;
            this.rdbtnMulti.Location = new System.Drawing.Point(16, 87);
            this.rdbtnMulti.Name = "rdbtnMulti";
            this.rdbtnMulti.Size = new System.Drawing.Size(113, 21);
            this.rdbtnMulti.TabIndex = 2;
            this.rdbtnMulti.TabStop = true;
            this.rdbtnMulti.Text = "Multiplicación";
            this.rdbtnMulti.UseVisualStyleBackColor = true;
            this.rdbtnMulti.CheckedChanged += new System.EventHandler(this.rdbtnMulti_CheckedChanged);
            // 
            // btnProcesar
            // 
            this.btnProcesar.Location = new System.Drawing.Point(12, 226);
            this.btnProcesar.Name = "btnProcesar";
            this.btnProcesar.Size = new System.Drawing.Size(434, 40);
            this.btnProcesar.TabIndex = 1;
            this.btnProcesar.Text = "Procesar";
            this.btnProcesar.UseVisualStyleBackColor = true;
            this.btnProcesar.Click += new System.EventHandler(this.btnProcesar_Click);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.txtNumero2);
            this.groupBox2.Controls.Add(this.txtNumero1);
            this.groupBox2.Controls.Add(this.label2);
            this.groupBox2.Controls.Add(this.label1);
            this.groupBox2.Location = new System.Drawing.Point(218, 12);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(228, 157);
            this.groupBox2.TabIndex = 2;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Valores";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(23, 26);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(74, 17);
            this.label1.TabIndex = 0;
            this.label1.Text = "Numero 1:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(23, 87);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(74, 17);
            this.label2.TabIndex = 1;
            this.label2.Text = "Numero 2:";
            // 
            // txtNumero1
            // 
            this.txtNumero1.Location = new System.Drawing.Point(26, 46);
            this.txtNumero1.Name = "txtNumero1";
            this.txtNumero1.Size = new System.Drawing.Size(186, 22);
            this.txtNumero1.TabIndex = 2;
            // 
            // txtNumero2
            // 
            this.txtNumero2.Location = new System.Drawing.Point(26, 107);
            this.txtNumero2.Name = "txtNumero2";
            this.txtNumero2.Size = new System.Drawing.Size(186, 22);
            this.txtNumero2.TabIndex = 3;
            // 
            // labelResultado
            // 
            this.labelResultado.AutoSize = true;
            this.labelResultado.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelResultado.Location = new System.Drawing.Point(12, 182);
            this.labelResultado.Name = "labelResultado";
            this.labelResultado.Size = new System.Drawing.Size(108, 25);
            this.labelResultado.TabIndex = 3;
            this.labelResultado.Text = "Resultado";
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.btnPausa2);
            this.groupBox3.Controls.Add(this.btnPausa1);
            this.groupBox3.Controls.Add(this.pgrBarHilo2);
            this.groupBox3.Controls.Add(this.pgrBarHilo1);
            this.groupBox3.Controls.Add(this.btnHilo2);
            this.groupBox3.Controls.Add(this.btnHilo1);
            this.groupBox3.Location = new System.Drawing.Point(12, 281);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(434, 164);
            this.groupBox3.TabIndex = 4;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "Manejo de Hilos";
            // 
            // btnHilo1
            // 
            this.btnHilo1.Location = new System.Drawing.Point(33, 40);
            this.btnHilo1.Name = "btnHilo1";
            this.btnHilo1.Size = new System.Drawing.Size(75, 23);
            this.btnHilo1.TabIndex = 0;
            this.btnHilo1.Text = "Hilo 1";
            this.btnHilo1.UseVisualStyleBackColor = true;
            this.btnHilo1.Click += new System.EventHandler(this.btnHilo1_Click);
            // 
            // btnHilo2
            // 
            this.btnHilo2.Location = new System.Drawing.Point(33, 97);
            this.btnHilo2.Name = "btnHilo2";
            this.btnHilo2.Size = new System.Drawing.Size(75, 23);
            this.btnHilo2.TabIndex = 1;
            this.btnHilo2.Text = "Hilo 2";
            this.btnHilo2.UseVisualStyleBackColor = true;
            this.btnHilo2.Click += new System.EventHandler(this.btnHilo2_Click);
            // 
            // pgrBarHilo1
            // 
            this.pgrBarHilo1.Location = new System.Drawing.Point(153, 40);
            this.pgrBarHilo1.Name = "pgrBarHilo1";
            this.pgrBarHilo1.Size = new System.Drawing.Size(205, 23);
            this.pgrBarHilo1.TabIndex = 2;
            // 
            // pgrBarHilo2
            // 
            this.pgrBarHilo2.Location = new System.Drawing.Point(153, 97);
            this.pgrBarHilo2.Name = "pgrBarHilo2";
            this.pgrBarHilo2.Size = new System.Drawing.Size(205, 23);
            this.pgrBarHilo2.TabIndex = 3;
            // 
            // Hilo1
            // 
            this.Hilo1.WorkerReportsProgress = true;
            this.Hilo1.WorkerSupportsCancellation = true;
            this.Hilo1.DoWork += new System.ComponentModel.DoWorkEventHandler(this.Hilo1_DoWork);
            this.Hilo1.ProgressChanged += new System.ComponentModel.ProgressChangedEventHandler(this.Hilo1_ProgressChanged);
            this.Hilo1.RunWorkerCompleted += new System.ComponentModel.RunWorkerCompletedEventHandler(this.Hilo1_RunWorkerCompleted);
            // 
            // Hilo2
            // 
            this.Hilo2.WorkerReportsProgress = true;
            this.Hilo2.WorkerSupportsCancellation = true;
            this.Hilo2.DoWork += new System.ComponentModel.DoWorkEventHandler(this.Hilo2_DoWork);
            this.Hilo2.ProgressChanged += new System.ComponentModel.ProgressChangedEventHandler(this.Hilo2_ProgressChanged);
            this.Hilo2.RunWorkerCompleted += new System.ComponentModel.RunWorkerCompletedEventHandler(this.Hilo2_RunWorkerCompleted);
            // 
            // btnPausa1
            // 
            this.btnPausa1.Location = new System.Drawing.Point(364, 40);
            this.btnPausa1.Name = "btnPausa1";
            this.btnPausa1.Size = new System.Drawing.Size(54, 23);
            this.btnPausa1.TabIndex = 4;
            this.btnPausa1.Text = "P";
            this.btnPausa1.UseVisualStyleBackColor = true;
            this.btnPausa1.Click += new System.EventHandler(this.btnPausa1_Click);
            // 
            // btnPausa2
            // 
            this.btnPausa2.Location = new System.Drawing.Point(364, 97);
            this.btnPausa2.Name = "btnPausa2";
            this.btnPausa2.Size = new System.Drawing.Size(54, 23);
            this.btnPausa2.TabIndex = 5;
            this.btnPausa2.Text = "P";
            this.btnPausa2.UseVisualStyleBackColor = true;
            this.btnPausa2.Click += new System.EventHandler(this.btnPausa2_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(485, 457);
            this.Controls.Add(this.groupBox3);
            this.Controls.Add(this.labelResultado);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.btnProcesar);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = ".::Ejemplo 04::.";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.groupBox3.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton rdbtnMulti;
        private System.Windows.Forms.RadioButton rdbtnResta;
        private System.Windows.Forms.RadioButton rdbtnSuma;
        private System.Windows.Forms.Button btnProcesar;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.TextBox txtNumero2;
        private System.Windows.Forms.TextBox txtNumero1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label labelResultado;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.ProgressBar pgrBarHilo2;
        private System.Windows.Forms.ProgressBar pgrBarHilo1;
        private System.Windows.Forms.Button btnHilo2;
        private System.Windows.Forms.Button btnHilo1;
        private System.ComponentModel.BackgroundWorker Hilo1;
        private System.ComponentModel.BackgroundWorker Hilo2;
        private System.Windows.Forms.Button btnPausa2;
        private System.Windows.Forms.Button btnPausa1;
    }
}

