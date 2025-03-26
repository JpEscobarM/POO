using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class Dados
    {
        public double temperatura { get; set; }
        public double humidade { get; set; }

        public double pressao { get; set; }

        public Dados(double temperatura, double humidade, double pressao)
        {
            this.temperatura = temperatura;
            this.humidade = humidade;
            this.pressao = pressao;
        }

       
    }
}
