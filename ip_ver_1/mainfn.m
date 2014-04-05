
imagen=imread('s8.png');
imshow(imagen);
title('INPUT IMAGE WITH NOISE')

if size(imagen,3)==3 
    imagen=rgb2gray(imagen);
end
threshold = graythresh(imagen);
imagen =~im2bw(imagen,threshold);
imagen = bwareaopen(imagen,30);
pause(1);
imshow(~imagen);
title('INPUT IMAGE WITHOUT NOISE')
[L Ne]=bwlabel(imagen);
propied=regionprops(L,'BoundingBox');
hold on
for n=1:size(propied,1)
    rectangle('Position',propied(n).BoundingBox,'EdgeColor','g','LineWidth',2)
end
hold off
pause (1)
bpath='%d.bmp';
figure
for n=1:Ne
    [r,c] = find(L==n);
    n1=imagen(min(r):max(r),min(c):max(c));
    imshow(~n1);
    n2=imresize(~n1,[16 16]);
    path=sprintf(bpath,n);
    imwrite(n2,path,'bmp');
    pause(0.2);
end