print('Kelompok 42')
Pernyataan = {
    1: "Januari",
    2: "Februari",
    3: "Maret",
    4: "April",
    5: "Mei",
    6: "Juni",
    7: "Juli",
    8: "Agustus",
    9: "September",
    10: "Oktober",
    11: "November",
    12: "Desember"
}

kasus = float(input("Masukkan bulan kelahiran anda (1-12): "))
print("Anda lahir pada Bulan : %s" %Pernyataan.setdefault(kasus))
