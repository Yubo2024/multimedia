🎵1. 处理音频播放
MediaPlayer 播放音频
MediaPlayer.create(this, R.raw.music)：加载音频资源
mediaPlayer.start()：开始播放音乐
mediaPlayer.stop()：暂停音乐

🎥 2. 处理视频播放
VideoView 播放视频
videoView.setVideoURI(Uri.parse("android.resource://packageName/video.mp4"))
videoView.start()：播放视频
videoView.stop()：暂停视频

🛠 3. 处理按钮点击
绑定播放按钮：同时启动音频和视频
绑定停止按钮：暂停音频 & 视频，并重置到起始位置
