# headfirst

1, http://meldmerge.org/, 可以使用meld作为git merge工具
2,  在命令行工具安装完成后默认会在提交文件时在*所有提交的文件中的每一行的文本后面增加一个字符*，这样会导致其他人在合并文件时需要对全文件进行比对，解决这个问题需要在命令行中运行命令

git config --global core.autocrlf false
git config --global core.autocrlf false

git中文路径名称乱码
 git config --global core.quotepath false 

 让git mergetool不再生成烦人的备份文件（*.orig）
 git config --global mergetool.keepBackup false
 
 3,
