from percobaan2 import*

def non_return_func(praktikan1, praktikan2):
    print(f"Selamat Datang di Praktikum DKP 2022 {praktikan1} dan {praktikan2}")

def return_func(shift):
    print(f"Shift kalian adalah",shift)
    if(shift==1)or(shift==2):
        return print(f"Fungsi return mengembalikan nilai menjadi",shift*2)
    else:
        return print("Tidak ada shift tersebut")
    

def arbitrary_func(*penutup):
        for nama in penutup:
            print("Terimakasih",nama)
            

anonim_func = lambda praktikan1, praktikan2, kelompok : print(f"Ini adalah percobaan {praktikan1} dan {praktikan2}kelompok ",kelompok)

non_return_func("nama1","nama2")
return_func(7)
anonim_func("nama1","nama2",42)
arbitrary_func("nama1","nama2","nama3","nama4")

praktikan = contoh_method("nama1", "nama2")
praktikan.mulai()
praktikan.selesai(2)