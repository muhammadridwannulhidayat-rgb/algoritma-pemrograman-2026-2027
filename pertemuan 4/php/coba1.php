<?php
$nim = "I.2610555";
$nama = 'Muhammad ridwanul hidayat';
$umur = 18;
$nilai = 90;
$status = TRUE;

echo "NIM : " . $nim . "<br>";
echo "Nama : $nama<br>";
print "Umur : " . $umur;
print "<br>";
printf("Nilai : %.3f<br>", $nilai);
if ($status)
    echo "Status : Aktif";
else
    echo "Status : Tidak Aktif";
?>