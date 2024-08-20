#include <iostream>

using namespace std;

// Deklarasi Function
static long fungsiKombinasi(int n, int k);
static long fungsiFactorial(int n);

int main() {
    /*
        Gunakan fungsi kombinasi
        untuk mendapatkan segitiga pascal
        Rumus Kombinasi :
            c = Kombinasi, f = Factorial
            
            c(n, k) => f(n) / f(k) * f(n - k)
    */
   int i, j, n, k;

   cout << "Masukan tinggi piramida : ";
   cin >> n;

   // Awal untuk membuat pola
   for(i = 0; i < n; i++) {
        k = 0;
        for(j = 0; j < n; j++) {
            // Kondisi untuk membentuk pola piramida
            if(i + j <= n - 1) {
                cout << " ";
            } else {
                cout << " " << fungsiKombinasi(i - 1, k++) << "";
            }
        }
        cout << endl;
   }

   return 0;
}

// Rumus Kombinasi
static long fungsiKombinasi(int n, int k) {
    return fungsiFactorial(n) / (fungsiFactorial(k) * fungsiFactorial(n - k));
}

/*
    Rumus factorial
    Menggunakan Recursive Function
    Function yang memanggil dirinya sendiri
*/
static long fungsiFactorial(int n) {
    if(n == 0) return 1;
    return fungsiFactorial(n - 1) * n;
}
