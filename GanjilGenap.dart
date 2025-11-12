import 'dart:io';

void main(){
  stdout.write('Masukkan angka awal : ');
  int batas = int.parse(stdin.readLineSync()!);

  int jumlahgenap = 0;
  int jumlahganjil = 0;

  for (int i = 1; i <= batas; i++){
    if (i % 2 == 0){
      jumlahgenap++;
    } else {
      jumlahganjil++;
    }
  }

  print('\nJumlah angka genap : $jumlahgenap');
  print('Jumlah angka ganjil : $jumlahganjil');

}