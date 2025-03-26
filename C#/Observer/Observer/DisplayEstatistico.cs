using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class DisplayEstatistico : Observador
    {
		//IMPLEMENTA UM DISPLAY QUE APRESENTA A TEMPERATURA E UMIDADE MEDIAS  E
		//TEMPERATURAS MAXIMA E MINIMA CONSIDERANDO AS  10 ULTIMAS ATUALIZACOES


		private List<Dados> valoresLidos = new List<Dados>();

		public DisplayEstatistico()
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

		public double GetTemperaturaMedia()
		{
			
			

			int qtdTotalDados = valoresLidos.Count;

			if (valoresLidos.Count == 0) 
			return 0;

			double totalTemperatura = 0;
;			foreach(Dados d in valoresLidos)
			{
				totalTemperatura += d.temperatura;

			}

			return totalTemperatura/qtdTotalDados;
		}

		public double GetHumidadeMedia()
		{

			if (valoresLidos.Count == 0) return 0;

			int qtdTotalDados = valoresLidos.Count;

			double totalHumidade = 0;

			foreach(Dados d in valoresLidos)
			{
				totalHumidade += d.humidade;
			}

			return totalHumidade / qtdTotalDados;
		}

		public double getTemperaturaMaxima()
		{
			double max = 0;

			foreach(Dados d in valoresLidos)
			{
                if (d.temperatura > max)
                {
					max = d.temperatura;
                }
            }

			return max;
		}

		public double getTemperaturaMinima()
		{
			double min = 9999;

			foreach(Dados d in valoresLidos)
			{
				if(d.temperatura < min)
				{
					min = d.temperatura;
				}
			}
			return min;
		}

    }
}
