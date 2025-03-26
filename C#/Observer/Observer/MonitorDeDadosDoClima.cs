using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class MonitorDeDadosDoClima : SujeitoObservavel
    {

        private List<Observador> observadores;

        private double temperatura { get; set; }

        private double humidade { get; set; }

        private double presao { get; set; }


        private EquipamentoDeMonitoramento equipamento;

        public MonitorDeDadosDoClima()
        {
            
        }

        public MonitorDeDadosDoClima(EquipamentoDeMonitoramento equipamento)
        {
            this.equipamento = equipamento;
            observadores = new List<Observador>();

        }

        public void dadosMudaram()
        {
            this.temperatura = equipamento.temperaturaAtual;
            this.humidade = equipamento.humidadeAtual;
            this.presao = equipamento.pressaoAtual;

            this.notificaObservadores();
        }

        public void notificaObservadores()
        {
            foreach(Observador observ in observadores){
                observ.Atualiza(this.temperatura, this.humidade, this.presao);
            }
        }

        public void registraObservador(Observador o)
        {
            observadores.Add(o);
        }

        public void removeObservador(Observador o)
        {
            observadores.Remove(o);
        }
    }
}
