function y=mainfn(p)
imagen=imread('C:\Users\arjun\Documents\eclipse\mainfn\data\input\sam.png');

if size(imagen,3)==3 
    imagen=rgb2gray(imagen);
end
threshold = graythresh(imagen);
imagen =~im2bw(imagen,threshold);
imagen = bwareaopen(imagen,50);
[L Ne]=bwlabel(imagen);
propied=regionprops(L,'BoundingBox');

  path='C:\Users\arjun\Documents\eclipse\mainfn\data\segmented';
  if ~exist(path, 'dir')
  mkdir(path);
  end
  %delete('C:\Users\NIDHEESH\workspace\mainfn\data\seg images\*.bmp');
y=p;
for n=1:Ne
    [r,c] = find(L==n);
    n1=imagen(min(r):max(r),min(c):max(c));
    n2=imresize(~n1,[16 16]);
     baseFileName = sprintf('img_%d.bmp', n+p);
  fullFileName = fullfile(path, baseFileName);
  imwrite(n2, fullFileName);
  y=y+1;
end