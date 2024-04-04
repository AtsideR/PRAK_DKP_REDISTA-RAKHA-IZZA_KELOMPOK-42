<?php
echo "Kelompok 42<br>";
?>
<form method="post">
    Masukkan berat badan anda : <input type="text" name="berat"><br>
    Masukkan tinggi anda : <input type="text" name="tinggi"><br>
    <input type="submit" value="Lihat Nilai">
</form>

<?php
    $BMI  
    $angka = isset($_POST['angka'])?abs((int)$_POST['angka']):'';

    switch($angka){
        case ($angka>=61):
            echo "lansia";
            break;
        case ($angka>=21):
            echo "dewasa";
            break;
        case ($angka>=14):
            echo "remaja";
            break;
        case ($angka>=6):
            echo "anak anak";
            break;
        case ($angka>=1):
            echo "balita";
            break;
        default:
            echo "tidak valid";
    }

    echo "<br>Program Selesai";
?>
