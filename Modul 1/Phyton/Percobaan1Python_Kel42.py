import math
print('kelompok 42 shift 7')
print('- Redista Rakha Izza     (21120123130085)')
print('- Saiful Mustofa         (21120123130049)')
print('- Ezar Hardin Wiratama   (21120123140116)')
print('- Rafael Ardiasyah       (21120123120007)')
   
print('HASIL PENGHITUNGAN VOLUME DAN LUAS PERMUKAAN PRISMA SEGITIGA') 

alas_segitiga = 8 
tinggi_segitiga = 4
tinggi_prisma = 20
luas_alas = 1/2 * alas_segitiga * tinggi_segitiga  
luas_sisi1 = alas_segitiga * tinggi_prisma
n = 4 * math.sqrt(2)
luas_sisi2 = n * tinggi_prisma

V = luas_alas * tinggi_prisma 
L = (luas_alas * 2) + (luas_sisi2 * 2) + luas_sisi1
  
print ('Volume prisma segitiga =', + V) 
print ('luas permukaan = ', + L)