#include <iostream>

using namespace std;

int main()
{
    string nama;
    cout << "Kelompok 42"<< endl;
    cout << "Masukkan nama anda :" ;
    cin >> nama;
    if (nama == "Agus") {
        cout <<"Namaku "<< nama << "\n";
    }
    else {
        cout << "Namaku bukan Agus, aku " << nama <<"\n";
    }
    return 0;
}
