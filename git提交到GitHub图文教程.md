![image-20230609223614648](C:\Users\momo\AppData\Roaming\Typora\typora-user-images\image-20230609223614648.png)

![image-20230609225129075](C:\Users\momo\AppData\Roaming\Typora\typora-user-images\image-20230609225129075.png)

> 上传到远程仓库GitHub

1.在目标文件下右键找到并且打开  Git Bash Here 页面。

2.在命令行内输入 git init 初始化本地文件，在改目标文件下会自动创建出一个隐藏文件  .git 的文件，里面记载着我们的操作纪录等等。《不要改动里面的内容，不然git本地仓库会受损！》

3.使用 git add .      命令则将该目标文件夹的所有文件添加到暂存区。如果只是提交部分文件操作如下：git add [指定的文件1] [指定的文件2] 以此提交到暂存区。<img src="C:\Users\momo\AppData\Roaming\Typora\typora-user-images\image-20230610091305966.png" alt="image-20230610091305966" style="zoom:50%;" />

4. git commit -m "对提交暂存区里面的文件写对于的注解"   提交到本地仓库。（git commit -message）<img src="C:\Users\momo\AppData\Roaming\Typora\typora-user-images\image-20230610091236945.png" alt="image-20230610091236945" style="zoom: 50%;" />
5. 连接远程仓库   git remote add origin git@github.com:JerryYa-Tom/TestGit.git  其中的 git@github.com:JerryYa-Tom/TestGit.git 是在我们远程仓库的SSH 地址
6. 提交本地仓库文件到远程仓库  git push -u origin master  等待完成即可！
7. 高阶指令《分支》

<img src="C:\Users\momo\AppData\Roaming\Typora\typora-user-images\image-20230610091512017.png" alt="image-20230610091512017" style="zoom:50%;" />

<img src="C:\Users\momo\AppData\Roaming\Typora\typora-user-images\image-20230610091531491.png" alt="image-20230610091531491" style="zoom:50%;" />