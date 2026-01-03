
    @echo off
:: 1. 判断E盘下是否存在mytemp文件夹，不存在则创建
if not exist "E:\mytemp" (
    md "E:\mytemp"
    echo 已在E盘创建mytemp文件夹
)

        :: 2. 进入mytemp目录，判断hello.txt是否存在，不存在则创建
    cd /d "E:\mytemp"
            if not exist "hello.txt" (
    type nul > "hello.txt"
    echo 已在E:\mytemp创建hello.txt文件
) else (
    echo 提示：E:\mytemp下的hello.txt已存在，无需重复创建
)
    pause
