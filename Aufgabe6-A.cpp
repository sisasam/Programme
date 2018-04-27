#include <iostream>
#include <cmath>
// g++ -Wall Aufgabe6-A.cpp -o berechnungPi

long double pi(long double x);

int main() {
  long double n=2;
  std::cout << "Pi ist " << pi(n) << '\n';
  return 0;
}

long double pi(long double x){
long double c;
//int i =2;
//while ( std::abs(p-(c*2)) > e) {
for (int i =2; i <= 2; i=i+2) {
    c *= ((i*i)/((i-1)*(i+1)));
//    i = i+2;
  }
return c;
}
