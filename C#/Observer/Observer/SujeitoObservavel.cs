using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    interface SujeitoObservavel
    {

        void registraObservador(Observador o);

        void removeObservador(Observador o);

        void notificaObservadores();

        void dadosMudaram();


    }
}
