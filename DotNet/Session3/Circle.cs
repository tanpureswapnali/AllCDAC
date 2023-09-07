using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Session3
{
    internal class Circle
    {
        private readonly double _radius;


        public Circle(double radius)
        {
            this._radius = radius;

        }
        public double Radius { get { return _radius; } }
    }
}
