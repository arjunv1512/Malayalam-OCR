% Read in a standard MATLAB gray scale demo image.
folder = 'C:\Users\arjun\Documents\eclipse\mainfn\data\input';
baseFileName = 'sample.png';
% Get the full filename, with path prepended.
fullFileName = fullfile(folder, baseFileName);
% Check if file exists.
if ~exist(fullFileName, 'file')
	% File doesn't exist -- didn't find it there.  Check the search path for it.
	fullFileName = baseFileName; % No path this time.
	if ~exist(fullFileName, 'file')
		% Still didn't find it.  Alert user.
		errorMessage = sprintf('Error: %s does not exist in the search path folders.', fullFileName);
		uiwait(warndlg(errorMessage));
		return;
	end
end
grayImage = imread(fullFileName);
% Get the dimensions of the image.  
% numberOfColorBands should be = 1.
[rows, columns, numberOfColorBands] = size(grayImage);
if numberOfColorBands > 1
	% It's not really gray scale like we expected - it's color.
	% Convert it to gray scale by taking only the green channel.
	grayImage = grayImage(:, :, 2); % Take green channel.
end
% Display the original gray scale image.
%subplot(2, 3, 1);
%imshow(grayImage, []);
%axis on;
%title('Original Grayscale Image', 'FontSize', fontSize);
% Enlarge figure to full screen.
%set(gcf, 'units','normalized','outerposition',[0 0 1 1]);
% Give a name to the title bar.
%set(gcf,'name','Demo by ImageAnalyst','numbertitle','off') 

% Let's compute and display the histogram.
[pixelCount, grayLevels] = imhist(grayImage);
%subplot(2, 3, 2); 
%bar(pixelCount);
%grid on;
%title('Histogram of original image', 'FontSize', fontSize);
%xlim([0 grayLevels(end)]); % Scale x axis manually.

% Binarize the image.
binaryImage = grayImage < 210;
%subplot(2, 3, 3);
%imshow(binaryImage, []);
%axis on;
%title('Binary Image', 'FontSize', fontSize);

% Find the lines and plot them.
verticalProfile = any(binaryImage, 2);
%subplot(2, 3, 4);
%plot(verticalProfile);
%grid on;
%title('Vertical Profile', 'FontSize', fontSize);

% Find out where each line starts
rowStarts = find(diff(verticalProfile)>0)+1
rowEnds = find(diff(verticalProfile)<0)
%subplot(2, 3, 5:6);
%title('This Line', 'FontSize', fontSize);
s=0;
delete('C:\Users\arjun\Documents\eclipse\mainfn\data\input\sam.png');
delete('C:\Users\arjun\Documents\eclipse\mainfn\data\segmented\*.bmp');
for row = 1 : length(rowStarts)
	thisRow1 = rowStarts(row);
	thisRow2 = rowEnds(row);
	croppedImage = grayImage(thisRow1:thisRow2, :);
    imwrite(croppedImage,'C:\Users\arjun\Documents\eclipse\mainfn\data\input\sam.png');
    y=mainfn(s);
    s=s+y;
	%imshow(croppedImage);
	%caption = sprintf('Line of text #%d is between lines %d and %d (inclusive)', ...
	%	row, thisRow1, thisRow2)
	%title(caption, 'FontSize', fontSize);
	
	%promptMessage = sprintf('Showing image between lines %d and %d (inclusive).\nDo you want to Continue processing,\nor Cancel to abort processing?',...
	%	thisRow1, thisRow2);
	%titleBarCaption = 'Continue?';
	%button = questdlg(promptMessage, titleBarCaption, 'Continue', 'Cancel', 'Continue');
	%if strcmpi(button, 'Cancel')
		%return;
	%end
end
if ~exist('C:\Users\arjun\Documents\eclipse\mainfn\data\input\sam.png')
 main();
end
