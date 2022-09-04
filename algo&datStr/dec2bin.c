#include <iostream.h>
void bits(int n){
    if(n){
        bits(n/2);
        cout << n%2
    }
}