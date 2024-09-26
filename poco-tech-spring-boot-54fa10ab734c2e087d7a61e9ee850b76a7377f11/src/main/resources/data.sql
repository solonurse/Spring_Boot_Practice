insert into issues (summary, description) values ('バグA', 'バグがあります');
insert into issues (summary, description) values ('機能要望B', 'Bに追加機能がほしいです');
insert into issues (summary, description) values ('画面Cが遅い', '早くしてほしいです');

-- password1234
insert into users (username, password, authority) values ('tom', '66ee84157709b751c89c74501de77abe9584a1f608b3a47f0401bde07e2dbece5e369f013bf9647e', 'ADMIN');
insert into users (username, password, authority) values ('bob', 'b092dc355c3fb8205482897141fe0ef830a0494a449370061ceb22f3d91265ac4d28747d73868ca2', 'USER');
