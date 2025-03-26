using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class EquipamentoDeMonitoramento 
    {
        private Random gerador = new Random();

        private SujeitoObservavel monitorDadosClima;

        public double temperaturaAtual { get; set; }

        public double humidadeAtual { get; set; }

        public double pressaoAtual { get; set; }


        private double GetNuemro(int min, int max)
        {
            return min + (gerador.NextDouble() * (max - min));
        }


        public async Task Coletar()
        {
            
           while(true)
            {
                this.temperaturaAtual = this.GetNuemro(0, 35);

                this.humidadeAtual = this.GetNuemro(10, 100);

                this.pressaoAtual = this.GetNuemro(900, 1100);

                this.monitorDadosClima.dadosMudaram();

                await Task.Delay(3000);
            }

        }

        public void setMonitorDadosClima(SujeitoObservavel monitorDadosClima)
        {
            this.monitorDadosClima = monitorDadosClima;
        }

    }
}
