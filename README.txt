CÁCH LẤY FILE APK

Cách 1 - Android Studio:
  1. File > Open > chọn thư mục CoCaro, chờ Gradle sync xong.
  2. Build > Build APK(s). File nằm ở app/build/outputs/apk/debug/app-debug.apk.

Cách 2 - GitHub Actions (không cần cài gì):
  1. Tạo repo mới, đẩy toàn bộ thư mục này lên (giữ nguyên thư mục .github).
  2. Vào tab Actions > "Build APK" > chờ chạy xong.
  3. Tải artifact "CoCaro-apk" về, giải nén ra file .apk rồi cài lên điện thoại.

Giao diện game nằm ở app/src/main/assets/index.html, sửa file này để đổi game.
