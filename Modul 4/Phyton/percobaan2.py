class contoh_method:
 #initmethod
    def __init__(self, praktikan1, praktikan2):
        self.praktikan1=praktikan1
        self.praktikan2=praktikan2
 #selfparameter
    def mulai(self):
         print (f"Selamat Datang di Percobaan 2 {self.praktikan1} dan {self.praktikan2}")
 #methoddenganparameter 
    def selesai(self, waktu):
        print("Percobaan akan selesai dalam : ")
        while waktu >0:
            print(waktu)
            waktu -=1