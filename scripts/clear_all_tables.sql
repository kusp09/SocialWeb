
set autocommit=0;

delete from jee.private_messages;
delete from jee.wall_posts;
delete from jee.friends;
delete from jee.user_profile;
delete from jee.user_information;
delete from jee.user_credential;

commit;