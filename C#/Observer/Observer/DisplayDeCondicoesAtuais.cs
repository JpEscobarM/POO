using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class DisplayDeCondicoesAtuais : Observador
    //APRESENTAR TEMPERATURA UMIDADE E PRESSA ATUIAIS
    //E ULTIMOS 10 VALORES LIDOS
    {
        private List<Dados> valoresLidos = new List<Dados>();


        public DisplayDeCondicoesAtuais()
        {

        }

        public void Atualiza(double temperatura, double humidade, double presao)
        {   
            if(valoresLidos.Count == 10)
            {
                valoresLidos.RemoveAt(0);
            }
            valoresLidos.Add(new Dados(temperatura, humidade, presao));
        }

        //LISTA DE DADOS PARA EXIBIR
        public List<Dados> retornaDadosClima()
        {
            return valoresLidos;
        }



    }

}
