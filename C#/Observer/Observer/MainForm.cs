using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Observer
{
    class MainForm: Form
    {
        private Button btnConectarCondAtual;
        private Button btnConectarEstat;
        private Button btnDesconectarCondAtual;
        private Button btnDesconectarEstat;

        private TextBox outputCondAtual;
        private TextBox outputEstat;

        private EquipamentoDeMonitoramento equipamento;
        private MonitorDeDadosDoClima monitor;
        private DisplayDeCondicoesAtuais displayCondAtual;
        private DisplayEstatistico displayEstat;


        public MainForm()
        {
            Text = "Sistema de Monitoramento Climático";
            Width = 800;
            Height = 600;

            btnConectarCondAtual = new Button { Text = "Conectar Condições Atuais", Top = 20, Left = 20, Width = 150 };
            btnDesconectarCondAtual = new Button { Text = "Desconectar Condições Atuais", Top = 50, Left = 20, Width = 150 };

            btnConectarEstat = new Button { Text = "Conectar Estatísticas", Top = 80, Left = 20, Width = 150 };
            btnDesconectarEstat = new Button {Text = "Desconectar Estatísticas", Top = 110, Left = 20, Width = 150 };

            outputCondAtual = new TextBox { Multiline = true, Top = 20, Left = 200, Width = 550, Height = 200, ReadOnly = true };
            outputEstat =  new TextBox { Multiline = true, Top = 240, Left = 200, Width = 550, Height = 300, ReadOnly = true };

            Controls.Add(btnConectarCondAtual);
            Controls.Add(btnDesconectarCondAtual);
            Controls.Add(btnConectarEstat);
            Controls.Add(btnDesconectarEstat);
            Controls.Add(outputCondAtual);
            Controls.Add(outputEstat);

            equipamento = new EquipamentoDeMonitoramento();
            monitor = new MonitorDeDadosDoClima(equipamento);
            equipamento.setMonitorDadosClima(monitor);

            displayCondAtual = new DisplayDeCondicoesAtuais();
            displayEstat = new DisplayEstatistico();

            btnConectarCondAtual.Click += (s, e) => monitor.registraObservador(displayCondAtual);
            btnDesconectarCondAtual.Click += (s, e) => monitor.removeObservador(displayCondAtual);
            btnConectarEstat.Click += (s, e) => monitor.registraObservador(displayEstat);
            btnDesconectarEstat.Click += (s, e) => monitor.removeObservador(displayEstat);

            Task.Run(async () => await equipamento.Coletar());

            var timer = new Timer();
            timer.Interval = 1000;
            timer.Tick += (s, e) => AtualizarDisplays();
            timer.Start();

        }

        private void AtualizarDisplays()
        {
            var dados = displayCondAtual.retornaDadosClima();
            outputCondAtual.Text = string.Join("\r\n", dados.Select(d => $"Temp: {d.temperatura:F1} °C, Umid: {d.humidade:F1} %, Press: {d.pressao:F1} hPa"));

            outputEstat.Text =
                $"Média Temp: {displayEstat.GetTemperaturaMedia():F1}\r\n" +
                $"Média Umid: {displayEstat.GetHumidadeMedia():F1}\r\n" +
                $"Temp Máx: {displayEstat.getTemperaturaMaxima():F1}\r\n" +
                $"Temp Mín: {displayEstat.getTemperaturaMinima():F1}";
        }

    }
}
