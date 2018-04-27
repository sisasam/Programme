#include <iostream>
#include <cmath>
// g++ -Wall Aufgabe6-A.cpp -o berechnungPi


int main() {
  double c;
  for (int i =2; i <= 40; i=i+2) {
      c *= i;
  std::cout << "Pi halbe ist " << c << '\n';
}
  return 0;
}
